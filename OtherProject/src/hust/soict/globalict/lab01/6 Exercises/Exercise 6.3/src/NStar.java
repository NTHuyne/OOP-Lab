import java.util.Scanner;

public class NStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height, i, j;
        System.out.println("Enter height: ");
        height =  sc.nextInt();
        int space = height - 1;
        for(j = 1; j <= height; j++){
            for (i = 1; i<= space; i++){
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++){               
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
