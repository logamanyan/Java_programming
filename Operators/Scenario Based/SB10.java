import java.util.*;
public class SB10
{
     public static void main (String[] args) {
        {
            Scanner sc= new Scanner(System.in);
            int Basic=sc.nextInt();
            int Hr=sc.nextInt();
            int Allowance=sc.nextInt();
            int Salary=Basic+Hr+Allowance;
            System.out.println(Salary);
        }
    }
}