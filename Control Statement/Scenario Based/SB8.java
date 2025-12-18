import java.util.Scanner;
public class SB8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int stored = 1234;
        System.out.print("Enter PIN: ");
        int enter = s.nextInt();
        if (enter == stored) System.out.println("PIN Match");
        else System.out.println("Invalid PIN");
    }
}