import java.time.LocalTime;

public class Q24
{
    public static void main(String []args){
    LocalTime time =LocalTime.now();

    System.out.println(time.getHour()+"Hours :"+time.getMinute()+"Minutes :"+time.getSecond()+"Seconds");

}
}