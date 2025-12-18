import java.util.*;
public class Leap {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%4==0||a%100!=0)
        {
System.out.println(a+" This is leap year");


        }
        else
        {
            System.out.println(a+" Not a leap year");
        }


    }
}

