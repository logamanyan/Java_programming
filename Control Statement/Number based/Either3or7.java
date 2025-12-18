import java.util.Scanner;

public class Either3or7 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();

        if(a%3==0||a%7==0)
        {
            System.out.println("Number is divisible by 3 or 7");
        }
        else
        {
            System.out.println(" Number is not divisible by both");
        }

    }
    
}
