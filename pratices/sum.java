package pratices;
import java.util.Scanner;
public class sum {

    public static void sum(int a, int b){
        int sum=a+b;
        System.out.println("the sum is :" +sum);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        sum( a, b);

        }

    }