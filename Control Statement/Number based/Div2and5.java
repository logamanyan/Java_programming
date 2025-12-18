import java.util.Scanner;

public class Div2and5 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();

        if((a%2==0&&a%5==0)&&(a%8!=0))
        {
            System.out.println("Number is divisible by both 2 and 5 but not by 8");
        }
        else
        {
            System.out.println(" Number is not divisible");
        }

    }
    
}
