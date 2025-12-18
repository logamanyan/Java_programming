import java.util.Scanner;

public class Digitcheck {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>=0 &&a<=9)
        {
            System.out.println("1 digit");
        }
        else if(a>=10&&a<=99)
        {
            System.out.println("2 digit");
        }
        else if(a>=100&&a<=999)
        {
            System.out.println("3 digit");
        }

    }
    
}
