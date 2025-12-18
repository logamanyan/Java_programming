import java.util.*;
public class Case

{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        char a=s.next().charAt(0);
        if(a>='A'&&a<='Z')
        {
            System.out.println("Upper case");
        }
        else if(a>='a'&&a<='z')
        {
            System.out.println("Lower case");
        }
        else if(a>='0'&&a<='9')
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Symbol");
        }
    }
}