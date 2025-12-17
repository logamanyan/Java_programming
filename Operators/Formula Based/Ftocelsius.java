import java.util.*;
public class Ftocelsius {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double c=s.nextDouble();
        double f=(c*5/9)+32;
        System.out.printf("The value of Fahernheat to Celsius is %.2f " ,f);
    }
}
