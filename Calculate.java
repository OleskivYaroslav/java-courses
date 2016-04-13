public class Calculate{

	public static void main(String[] arg){
		System.out.println("Calculate...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[2]);
		double sum=0;
		switch (arg[1]) {
			case ("+"):
				sum = first + second;
				break;
			case ("-"):
				sum = first - second;
				break;
			case ("*"):
				sum = first * second;
				break;
			case ("/"):
				sum = (Double)first / second;
				break;
			case ("^"):
				sum = Math.pow(first, second);
				break;
			default: System.out.println("Some ERROR");
		}
		System.out.println("Sum = "+sum);
	}

}