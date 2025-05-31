package Array;
 import java.util.Scanner;
public class basic_2 {
    public static void main(String[] args) {

        // arrays of primitives

        Scanner in=new Scanner(System.in);
        int [] array=new int[5];
        array [0]=23;
        array [1]=433;
        array [2]=2342;
        array [3]=543;
        array [4]=21;

        System.out.println(array[2]);
        
        //using for loops

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
