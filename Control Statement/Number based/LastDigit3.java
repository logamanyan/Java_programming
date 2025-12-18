import java.util.Scanner;
public class LastDigit3 {
     public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=a%10;
        if(b%3==0)
        {
            System.out.println("Divisible by 3");
        }
        else
        {
            System.out.println("Not Divisible by 3");
        }

    }
    
    
}



