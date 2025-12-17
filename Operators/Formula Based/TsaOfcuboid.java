import java.util.*;
public class TsaOfcuboid {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int v=a*b*c; 
        int tsa = 2*((a*b)+(b*c)+(b*a));
        int p = 4*(a+b+c); 
        System.out.println("The volume of cube is " +v);
        System.out.println("The total surface of cube is " +tsa);
        System.out.println("The perimetr of cube is " +p);





    }

}
