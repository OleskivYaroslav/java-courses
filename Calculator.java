/*
* Клас реалізує калькулятор для
* додавання, віднімання, ділення та
* множення двох чи більше параметрів,
* з можливістю подальшого використання
* отриманого результату result
* */

public class Calculator{

    /*
    результат проведених операцій
    * */
    private double result;

    /*додавання усіх перданих параметрів
    * */
    public void add(double ... params){
        for (Double param : params){
            this.result+=param;
        }
    }

    /*віднімання param2 від param1
    param1 - param2
    * */
    public void minus(double param1,double param2){
        this.result=param1-param2;
    }

    /*ділення param1 на param2
    param1/param2
    * */
    public void devide(double param1,double param2){
        this.result=param1/param2;
    }

    /*множення усіх перданих параметрів
    * */
    public void product(double ... params){
        for (Double param : params){
            this.result*=param;
        }
    }

    /*додавання параметра param до
    раніше отриманого результату result
    * */
    public void addToResult(double param){
        this.result+=param;
    }

    /*віднімання параметра param від
    раніше отриманого результату result
    * */
    public void minusOfResult(double param){
        this.result-=param;
    }

    /*ділення раніше отриманого результату result
    на параметр param
    * */
    public void devideRusult(double param){
        this.result/=param;
    }

    /*множення параметра param на
    раніше отриманий результат result
    * */
    public void productOfResult(double param){
        this.result*=param;
    }

    /*повернення результату result
    * */
    public double getResult(){
        return this.result;
    }

    /*занулення результату result, для подальшого використання
    * */
    public void cleanResult(){
        this.result=0;
    }

}