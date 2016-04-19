import java.util.Scanner;
/*Клас реалізує щось на подобі середовища
* калькулятора в консолі, дозволяє виконувати
* прості арифметичні дії, із запитом на
* продовження обчислень, чи виходу з
* програми, та запитом на подальше
* використання отриманого результату
* використовуючи клас Calculator
* */

public class InteractRuner{
    /*Створення об'єкта класу Calculator
    * для ввиконання описаних в ньому арифметичних ситуацій
    * */
    Calculator calc = new Calculator();
    /*метод для виконання арифметичних
    * операцій з класу Calculator, використовуючи
    * задані зчитані раніше стрічки які є числами(first,second)
    * і дією яку треба виконати(sign)
    * */
    public void calculating(String first, String sign, String second){
        calc.cleanResult();
        switch (sign) {
            case ("+"):
                calc.add(Double.valueOf(first), Double.valueOf(second));
                break;
            case ("-"):
                calc.minus(Double.valueOf(first), Double.valueOf(second));
                break;
            case ("*"):
                calc.product(Double.valueOf(first), Double.valueOf(second));
                break;
            case ("/"):
                calc.devide(Double.valueOf(first), Double.valueOf(second));
                break;
            default:
                System.out.println("Some ERROR ");
        }
    }

    /*метод для виконання арифметичних
    * операцій з класу Calculator, використовуючи
    * попередньо обчислений результат,
    * задану зчитану раніше стрічку яка є числом(first)
    * і дією яку треба виконати(sign)
    * */
    public void calculatingWithResult(String sign, String first){
        switch (sign) {
            case ("+"):
                calc.addToResult(Double.valueOf(first));
                break;
            case ("-"):
                calc.minusOfResult(Double.valueOf(first));
                break;
            case ("*"):
                calc.productOfResult(Double.valueOf(first));
                break;
            case ("/"):
                calc.devideRusult(Double.valueOf(first));
                break;
            default:
                System.out.println("Some ERROR");
        }
    }

    /*Метод main реалізує зчитування прикладу,
    * вивід результату з можливістю продовження
    * чи виходу з програми або подальшим використанням
    * отриманого результату
    * */
    public static void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        try{
            InteractRuner runer = new InteractRuner();
            String exit = "no";
            System.out.println("Enter problem ");
            String first = reader.next();
                String sign = reader.next();
                    String second = reader.next();
            runer.calculating(first , sign , second);
            System.out.println("Result = "+ runer.calc.getResult());
            System.out.println("Exit : yes/no");
            exit = reader.next();

            while (!exit.equals("yes")){
                System.out.println("Used previos result? : yes/no");
                String res = reader.next();
                if(res.equals("yes")){
                    System.out.println("Enter problem ");
                    System.out.print("result ");
                    sign = reader.next();
                    first = reader.next();
                    runer.calculatingWithResult(sign, first);
                }else{
                    System.out.println("Enter problem ");
                    first = reader.next();
                    sign = reader.next();
                    second = reader.next();
                    runer.calculating(first, sign, second);
                }
                System.out.println("Result = "+ runer.calc.getResult());
                System.out.println("Exit : yes/no");
                exit = reader.next();
            }
        }finally {
            reader.close();
        }
    }

}