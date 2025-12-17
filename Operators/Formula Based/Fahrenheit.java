import java.util.*;
public class Fahrenheit {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Double f=s.nextDouble();
        double c=(f-32)*5/9;
        System.out.printf("%.2f",c);
    }
}

