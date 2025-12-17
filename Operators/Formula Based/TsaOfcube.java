import java.util.*;
public class TsaOfcube {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int v= (int)Math.pow(a,3);
        int tsa = 6*(a*a);
        int p = 12*(a);
        System.out.println("The volume of cube is " +v);
        System.out.println("The total surface of cube is " +tsa);
        System.out.println("The perimetr of cube is " +p);





    }

}
