import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] numbers = new double[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextDouble();
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] > numbers[j]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
