package Conditions.Questions.Q_6;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        //Take input from the user until he enters"X" or "x"
        int ans=0;
        while(true){
            //take the operator as input
            System.out.println("Enter the operator");
            char op= in.next().trim().charAt(0);

            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                //input 2 numb
                System.out.println("enter 2 numbers");
                int num1=in.nextInt();
                int num2=in.nextInt();

                if(op=='+'){
                    ans=num1+num2;
                }

                if(op=='-'){
                    ans=num1-num2;
                }

                if(op=='*'){
                    ans=num1*num2;
                }

                if(op=='/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                    if(op=='%'){
                    ans=num1%num2;
                    }
                }else if(op=='x' || op== 'X'){
                break;
            }else{
                System.out.println("Invalid Operator");
            }
            System.out.println(ans);


        }
    }
}
