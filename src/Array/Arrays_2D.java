package Array;
import java.util.Scanner;
public class Arrays_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = new int[3][3];
        System.out.println(array.length);

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = in.nextInt();

            }
        }
            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                    System.out.print(array[row][col] + " ");
                }
                System.out.println();
            }
        }
    }

