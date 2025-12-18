import java.util.*;
public class Atm {
    public static void main(String[] args)
    {
        double bal=10000.00;
        System.out.println(bal);
        Scanner s=new Scanner(System.in);
        System.out.println("1. Balance Check\n2. Deposit\n3. Withdraw");
        int c= s.nextInt();

        switch (c) {
            case 1:
                System.out.println(bal);
                break;
            case 2:
                int d=s.nextInt();   
                bal=bal+d;
                System.out.println(bal);
                break;
            case 3:
                int w =s.nextInt();
                bal=bal-w; 
                System.out.println(bal); 
                break;   
        
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    
}
