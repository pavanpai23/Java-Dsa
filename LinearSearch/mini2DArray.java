package LinearSearch;
import java.util.Arrays;

public class mini2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4,22},
                {12,23,123,4,224,4,4},
                {23,21,34,121}
        };
        System.out.println(max(arr));

    }
    static  int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
                return max;
    }
}

