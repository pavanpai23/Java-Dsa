package Functions;
 import java.util.Scanner;
public class function {
    public static void main(Stringexample[] args) {
       int ans =sum2();
        System.out.println(ans);
    }
    static int sum2(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the 1st number :");
        int num1=in.nextInt();
        System.out.println("enter the 2nd number:");
        int num2=in.nextInt();
        int sum2=num1+num2;
       return sum2;


    }
//        sum();
//    }
//    static void sum(){
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter the 1st number :");
//        int num1=in.nextInt();
//        System.out.println("enter the 2nd number:");
//        int num2=in.nextInt();
//        int sum=num1+num2;
//        System.out.println("sum is :sum" +sum);
//    }

}
