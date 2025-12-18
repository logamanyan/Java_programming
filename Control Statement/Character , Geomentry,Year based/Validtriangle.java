// Write a Java Program to check whether the sum of three angles forms a valid triangle.
import java.util.*;
public class Validtriangle {
    
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    
    if((a+b)>c||(b+c)>a||(c+a)>b)
    {
        System.out.println("Valid Triangle");
    }
    else

    {
        System.out.println("Not Valid");
    }

    }
}
