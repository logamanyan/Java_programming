import java.util.Scanner;
public class SB17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Day: ");
        String d = s.next();
        if (d.equalsIgnoreCase("Saturday") || d.equalsIgnoreCase("Sunday")) 
            System.out.println("Weekend: ₹300");
        else System.out.println("Weekday: ₹200");
    }
}