package Conditions.Questions.Q_1;
 import java.util.Scanner;
public class largest {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        //Q1 - Find the largest of 3 no.

        int A=in.nextInt();
        int B=in.nextInt();
        int C=in.nextInt();

        int max=A;
        if(B>max) {
            max = B;
        }
        if (C>max) {
            max = C;
        }
        System.out.println(max);

        }

    }

