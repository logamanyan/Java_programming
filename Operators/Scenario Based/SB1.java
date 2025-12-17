import java.util.*;
public class SB1 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double p = s.nextDouble();
        double d=s.nextDouble();
        double da= (p*d)/100;
        double dp=p-da;
        System.out.printf("the price after discount %.2f",dp);
    }
}
