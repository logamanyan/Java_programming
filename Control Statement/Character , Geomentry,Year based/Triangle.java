//Write a Java Program to check whether a triangle is equilateral, isosceles, or scalene.
import java.util.*;
public class Triangle {
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    
    if(a==b&&b==c&&c==a)
    {
        System.out.println("equilateral");
    }
    else if((a==b&&a!=c)||(a==c&&a!=b))
    {
         System.out.println("isosceles");
    }
    else

    {
        System.out.println("scalene");
    }


    }

  
}
