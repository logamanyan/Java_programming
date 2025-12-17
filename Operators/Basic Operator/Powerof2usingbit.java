import java.util.*;

public class Powerof2usingbit {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println((a>=0&& ((a&(a-1))==0))?"Yes":"No");
    }
}
