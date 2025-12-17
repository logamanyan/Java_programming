import java.util.*;
public class SB15 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int amount=s.nextInt();
        int n500 =amount/500;
        amount=amount%500;
        int n200=amount/200;
        amount=amount%200;
        int n100=amount/100;
        amount=amount%100;

    System.out.println("500 :"+n500+" :200 :"+n200+" 5:100 :"+n100);
        
    }
    
}
