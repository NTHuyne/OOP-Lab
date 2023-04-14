import java.util.Scanner;

public class Eq1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.println("Solve the equation: ax +b = 0 (a!=0)");
		System.out.println("Enter a: ");
		a = sc.nextDouble();
		System.out.println("Enter b: ");
		b = sc.nextDouble();
		if (a == 0 && b == 0){
			System.out.println("Infinite solution");
		}
		else if (b!=0 && a == 0){
			System.out.println("No solution");
		}
		else{
			System.out.println("One solution: " + (-b/a));
		}
	}
} 