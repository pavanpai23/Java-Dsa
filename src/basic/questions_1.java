package basic;
import java.util.Scanner;
public class questions_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        float sum=a+b+c;
        float avg=sum/3;
        System.out.println(sum);
        System.out.println(avg);
    }
}
