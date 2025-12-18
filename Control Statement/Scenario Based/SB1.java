import java.util.*;
public class SB1
{
    public static void main(String[] args )

    {
        Scanner s=new Scanner(System.in);
        double bill =s.nextDouble();
        double discount =0;
        if(bill<500)
        {
            System.out.print("No discount");
        }
        else if(bill>=500&&bill<999)
        {
              discount = (bill*10)/100;
             bill =bill-discount;
            System.out.print("10% Discount : Amount after discount "+(bill));
        }
        else if(bill>=1000&&bill<=2000)
        {
            discount =(bill*15)/100;
            bill =bill-discount;
            System.out.print("15% Discount : Amount after discount "+bill);
        }
        else
        {
              discount  =(bill*20)/100;
             bill =bill-discount;
            System.out.print("15% Discount : Amount after discount "+bill);
        }


    }
}