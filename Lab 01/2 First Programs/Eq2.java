import java.util.Scanner;

public class Eq2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Solve the system a11.x1 + a12.x2 = b1 ; a21.xa + a22.x2 = b2");
        double a11, a12, a21, a22, b1, b2;
        System.out.print("Input a11: "); a11 = sc.nextDouble();
        System.out.print("Input a12: "); a12 = sc.nextDouble();
        System.out.print("Input b1: "); b1 = sc.nextDouble();
        System.out.print("Input a21: "); a21 = sc.nextDouble();
        System.out.print("Input a22: "); a22 = sc.nextDouble();
        System.out.print("Input b2: "); b2 = sc.nextDouble();
        double D = a11*a22 - a12*a21;
        double Dx = b1*a22 - b2*a12;
        double Dy = a11 *b2 - a21*b1;
        if (D == 0 && Dx == 0 && Dy == 0){
            System.out.println("Infinite solutions");
        }
        else if (D == 0 && (Dx != 0 || Dy != 0)){
            System.out.println("No solution");
        }
        else if (D!=0 && Dx!=0 && Dy!=0){
            System.out.println("One solution: b1 = " + (Dx/D) + " and b2 = " + (Dy/D));
        }
        sc.close();
    }
}