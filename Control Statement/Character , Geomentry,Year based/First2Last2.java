import java.util.*;
public class First2Last2 {
    
    public static void main(String[] args)
        {
           Scanner s=new Scanner(System.in);
           int year=s.nextInt();
           int f=year%100;
           int l=year/100;
           if(f==l)
           {
            System.out.println("same");
           }
           else{
            System.out.println("Not same");
           }


        }
}
