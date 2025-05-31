package Array;
import java.util.Scanner;
import java.util.Arrays;
public class Maxvalue {
    public static void main(String[] args) {
//        int[] array = {1, 3, 34, 23, 42, 24};
//        System.out.println(max(array));
//
//    }
//
//    //imagin array is not empty
//    static int max(int[] array) {
//        int maxval = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > maxval) {
//                maxval = array[i];
//            }
//
//        }
//        return maxval;
//    }
//}

        //if range is specified

        int[] array = {1, 3, 34, 23, 42, 24};
        System.out.println(max(array,3,5));

    }


    static int max(int[] array,int statrt,int end) {
        int maxval = 0;
        for (int i = statrt; i < end; i++) {
            if (array[i] > maxval) {
                maxval = array[i];
            }

        }
        return maxval;
    }
}
