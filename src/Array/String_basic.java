package Array;
import java.util.Arrays;
import java.util.Scanner;
public class String_basic {
    public static void main(String[] args) {


        //Arrays of objectives

        Scanner in=new Scanner(System.in);
        String[] str=new String[5];
        for (int i = 0; i <str.length ; i++) {
            str[i] =  in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1]="pav";
        System.out.println(Arrays.toString(str));
    }
}
