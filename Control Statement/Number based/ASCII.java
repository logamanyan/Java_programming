import java.util.Scanner;

public class ASCII{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);

        if((int)a%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

    }
    
}
