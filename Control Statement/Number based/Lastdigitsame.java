import java.util.Scanner;

public class Lastdigitsame {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();

        if((a%10)==(b%10))
        {
            System.out.println("two numbers have the same last digit");
        }
        else
        {
            System.out.println(" two numbers not have the same last digit");
        }

    }
    
}
