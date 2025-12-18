import java.util.Scanner;

public class Monthdays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = s.nextInt();
        System.out.print("Enter Month (1-12): ");
        int month = s.nextInt();

        // 1. Check if Year and Month are valid
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("Invalid Input! Please enter a valid year and month (1-12).");
        } else {
            int days = 0;

            // 2. Determine number of days
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                case 2:
                    // Check for leap year
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
            }

            System.out.println("Year: " + year + " | Month: " + month);
            System.out.println("Number of days: " + days);
        }
    }
}