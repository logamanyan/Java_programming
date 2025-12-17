import java.util.*;
public class SB11
{
     public static void main (String[] args) {
        {
            Scanner sc= new Scanner(System.in);
            int Base=sc.nextInt();
             double profit=sc.nextDouble();
            double sell_price=Base +(Base*(profit/100));

            System.out.println(sell_price);
        }
    }
}