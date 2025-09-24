package basic;
import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float rad=in.nextFloat();
        double area = 3.14 * rad * rad;
        System.out.println(area);
    }
}
