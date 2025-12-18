public class SB7 {
    public static void main(String[] args) {
        int units = 550;
        double bill = 0;
        if (units <= 100) bill = 0;
        else if (units <= 300) bill = (units - 100) * 5;
        else bill = (200 * 5) + (units - 300) * 10;

        if (units > 500) bill *= 1.15; 
        System.out.println("Total Bill: ₹" + bill);
    }
}