import java.util.Scanner;

public class Calculate{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first double: ");
		double num1 = sc.nextDouble();
		System.out.println("Input the second double: ");
		double num2 = sc.nextDouble();
		System.out.println("Sum: "+ (num1 + num2));
		System.out.println("Difference: "+ (num1 - num2 > 0? num1 - num2 : num2 - num1));
		System.out.println("Product: "+ (num1 * num2));
		System.out.println("Quotient: "+ (num1 / num2));
		sc.close();
	}
}