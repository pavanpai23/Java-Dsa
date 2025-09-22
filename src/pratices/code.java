package pratices;
import java.util.Scanner;
public class code {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter the temp in c");

        for (int temp = 0; temp < 100; temp++) {
            float tempc = in.nextInt();
            float tempf = (tempc * 9 / 5) + 32;


            System.out.println(tempf);
        }

    }
}
