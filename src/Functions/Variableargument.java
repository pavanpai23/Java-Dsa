package Functions;
import java.util.Arrays;
public class Variableargument {
    public static void main(String[] args) {

        fun(2,23,4555,6,753,22,5);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
