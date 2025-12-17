import java.util.*;
public class Pointof2 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int x1=s.nextInt();
        int y1=s.nextInt();
        int x2=s.nextInt();
        int y2=s.nextInt();
        double d=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.printf("The distance between two points is %.2f",d);
    }
}
