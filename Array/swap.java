package Array;
import java.util.Arrays;
public class swap {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 423, 34, 23};

        swap(array,1,2 );

        System.out.println(Arrays.toString(array));
    }

    static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }
}
