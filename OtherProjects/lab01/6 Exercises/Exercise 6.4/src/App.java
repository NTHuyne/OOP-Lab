import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0, monthNumber = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            System.out.print("Enter a year: ");
            String inputArr = scanner.nextLine();
            // Validating the year input
            try {
                year = Integer.parseInt(inputArr);
                if (year < 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid year. Please enter a non-negative integer.");
                continue;
            }
            
            System.out.print("Enter a month: ");
            String month = scanner.nextLine();
            // Validating the month input
            switch(month.toLowerCase()) {
                case "january":
                case "jan":
                case "1":
                    monthNumber = 1;
                    isValidInput = true;
                    break;
                case "february":
                case "feb":
                case "2":
                    monthNumber = 2;
                    isValidInput = true;
                    break;
                case "march":
                case "mar":
                case "3":
                    monthNumber = 3;
                    isValidInput = true;
                    break;
                case "april":
                case "apr":
                case "4":
                    monthNumber = 4;
                    isValidInput = true;
                    break;
                case "may":
                case "5":
                    monthNumber = 5;
                    isValidInput = true;
                    break;
                case "june":
                case "jun":
                case "6":
                    monthNumber = 6;
                    isValidInput = true;
                    break;
                case "july":
                case "jul":
                case "7":
                    monthNumber = 7;
                    isValidInput = true;
                    break;
                case "august":
                case "aug":
                case "8":
                    monthNumber = 8;
                    isValidInput = true;
                    break;
                case "september":
                case "sep":
                case "9":
                    monthNumber = 9;
                    isValidInput = true;
                    break;
                case "october":
                case "oct":
                case "10":
                    monthNumber = 10;
                    isValidInput = true;
                    break;
                case "november":
                case "nov":
                case "11":
                    monthNumber = 11;
                    isValidInput = true;
                    break;
                case "december":
                case "dec":
                case "12":
                    monthNumber = 12;
                    isValidInput = true;
                    break;
                default:
                    System.out.println("Invalid month. Please enter a valid month name or number.");
                    break;
            }
        }
        switch(monthNumber){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Number of day: 31");
                break;
            case 4, 6, 9, 11:
                System.out.println("Number of day: 30");
                break;
            case 2:
                if(year % 4 == 0 && year % 400 == 0){
                    System.out.println("Number of day: 29");
                }
                else{
                    System.out.println("Number of day: 28");
                }
        }
        scanner.close();
    }
}
