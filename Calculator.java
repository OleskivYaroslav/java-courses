public class Calculator{
    private double result;

    public void add(double ... params){
        for (Double param : params){
            this.result+=param;
        }
    }

    public double getResult(){
        return this.result;
    }

    public void cleanResult(){
        this.result=0;
    }

}