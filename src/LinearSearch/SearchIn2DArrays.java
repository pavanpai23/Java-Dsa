package LinearSearch;
import java.util.Arrays;
public class SearchIn2DArrays {
    public static void main(String[] args) {
      int[][] arr={
              {1,2,3,4,22},
              {12,23,123,4,224,4,4},
              {23,21,34,121}
      };
      int target=34;
      int[] ans=Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static  int[] Search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
           if(arr[row][col]==target){
               return new int[]{row,col};
           }
            }
            
        }
        return new int[]{-1,-1};
    }
}
