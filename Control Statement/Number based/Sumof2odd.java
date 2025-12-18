import java.util.Scanner;

public class Sumof2odd {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if((a+b)%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

    }
    
}
