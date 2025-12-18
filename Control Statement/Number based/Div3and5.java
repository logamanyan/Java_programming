import java.util.Scanner;

public class Div3and5 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();

        if(a%3==0&&a%5==0)
        {
            System.out.println("Number is divisible by both 3 and 5");
        }
        else
        {
            System.out.println(" Number is not divisible by both 3 and 5");
        }

    }
    
}
