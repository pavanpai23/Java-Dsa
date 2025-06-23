package Array;
import java.util.Scanner;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int []array={1,34,5,2,5,32,23};
        Reverse(array);
        System.out.println(Arrays.toString(array));
    }
    static void Reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            //swap
            swap(array, start, end);
            start++;
            end--;
        }
    }
      static void swap ( int[] Array, int index1, int index2) {
          int temp = Array[index1];
          Array[index1] = Array[index2];
          Array[index2] = temp;
      }
}

