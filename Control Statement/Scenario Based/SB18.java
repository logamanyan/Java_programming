import java.util.Scanner;
public class SB18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Liters Consumed: ");
        int L = s.nextInt();
        double bill = 0;
        if (L <= 1000) bill = 0;
        else if (L <= 3000) bill = (L - 1000) * 0.005;
        else bill = (2000 * 0.005) + (L - 3000) * 0.01;
        System.out.println("Bill: ₹" + bill);
    }
}