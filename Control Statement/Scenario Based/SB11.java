import java.util.Scanner;
public class SB11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Purchase Amount: ");
        double amount = s.nextDouble();
        double discount = 0;

        if (amount >= 2000) discount = 0.20; // 20%
        else if (amount >= 1000) discount = 0.15; // 15%
        else if (amount >= 500) discount = 0.10; // 10%

        double saved = amount * discount;
        System.out.println("Discount Applied: " + (discount * 100) + "%");
        System.out.println("Final Bill: " + (amount - saved));
    }
}