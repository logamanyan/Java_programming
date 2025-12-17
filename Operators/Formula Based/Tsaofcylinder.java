import java.util.*;
public class Tsaofcylinder {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int h=s.nextInt();
        double v=3.14*(r*r)*h;
        double tsa =((2)*(3.14)*(r*r))+(2*3.14*r*h);
        System.out.println("The volume of cylinder is " +v);
        System.out.println("The total surface of cylinder is "+tsa);





    }

}
