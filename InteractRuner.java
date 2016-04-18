import java.util.Scanner;


public class InteractRuner{

    public static void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        try{
            Calculator calc = new Calculator();
            String exit = "no";
            System.out.println("Enter problem ");
            String first = reader.next();
            String sign = reader.next();
            String second = reader.next();
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
            System.out.println("Result = "+ calc.getResult());
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
                }else{
                    calc.cleanResult();
                    System.out.println("Enter problem ");
                    first = reader.next();
                    sign = reader.next();
                    second = reader.next();
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
                            System.out.println("Some ERROR");
                    }
                }
                System.out.println("Result = "+ calc.getResult());
                System.out.println("Exit : yes/no");
                exit = reader.next();
            }
        }finally {
            reader.close();
        }
    }

}