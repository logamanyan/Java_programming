import java.util.*;
public class SB9 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double total =s.nextInt();
        double intrest=s.nextInt();
        double time =s.nextDouble();
        double si=(total*intrest*time)/100;
        double tm = total+si;
                System.out.println(tm);
    }
}
