package Conditions.Questions.Q_10;
import java.util.Scanner;
public class positive {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n>=0){
            System.out.println("positive");
        }
        else {
            System.out.println("neagative");
        }
    }
}
