public class Calculator{
    private double result;

    public void add(double ... params){
        for (Double param : params){
            this.result+=param;
        }
    }

    public void minus(double param1,double param2){
        this.result=param1-param2;
    }

    public void devide(double param1,double param2){
        this.result=param1/param2;
    }

    public void product(double ... params){
        for (Double param : params){
            this.result*=param;
        }
    }

    public void addToResult(double param){
        this.result+=param;
    }

    public void minusOfResult(double param){
        this.result-=param;
    }

    public void devideRusult(double param){
        this.result/=param;
    }

    public void productOfResult(double param){
        this.result*=param;
    }

    public double getResult(){
        return this.result;
    }

    public void cleanResult(){
        this.result=0;
    }

}