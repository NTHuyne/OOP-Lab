import java.util.Scanner;
import java.lang.Math;

public class Eq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Solve ax^2 + bx + c = 0");  
        double a, b, c;
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        System.out.println("Enter c: ");
        c = sc.nextDouble();
        if (a==0){
            if (b == 0){
                if (c == 0){
                    System.out.println("Infinite solution");
                }
                else{
                    System.out.println("No solution");
                }
            }
            else{
                System.out.println("One solution: x = " + (-c/b));
            }
        }
        else{
            double delta =  b*b - 4*a*c;
            if (delta == 0){
                System.out.println("Double solution: x = " + (-b/(2*a)));
            }
            else if (delta < 0){
                System.out.println("No solutions");
            }
            else{
                double x1 = (-b-Math.sqrt(delta))/(2*a);
                double x2 = (-b+Math.sqrt(delta))/(2*a);
                System.out.println("Two solutions: x1 = " + x1 + " ;x2 = "+ x2);
            }
        }
        sc.close();
    }
    
}
