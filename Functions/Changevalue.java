package Functions;
import java.util.Arrays;
public class Changevalue {
    public static void main(String[] args) {

        int [] arr={1,23,12,43,57,32};
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Change(int[] arr){
        arr[0]=243;
    }
}
