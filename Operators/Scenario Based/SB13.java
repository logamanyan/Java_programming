import java.util.*;
public class SB13
{
     public static void main (String[] args) {
        {
            Scanner sc= new Scanner(System.in);
            int price=sc.nextInt();
             double total =sc.nextDouble();
            double free = total/4;
            double totalm=total-free;
            double totala=totalm*price;


            System.out.println(totala);
        }
    }
}