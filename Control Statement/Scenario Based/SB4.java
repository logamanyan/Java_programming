public class SB4 {
    public static void main(String[] args) {
        int battery = 50;
        if (battery == 100) System.out.println("Battery Full");
        else if (battery <= 20) System.out.println("Low Battery");
        else System.out.println("50% Consumed");
    }
}