package LinearSearch;

public class Minimum {
    public static void main(String[] args) {

        int[] arr={2,23,45,22,45,12,-3};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        int ans=arr[0];
        for (int i =1; i <arr.length ; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
                return ans;
    }
}
