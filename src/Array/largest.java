package Array;

public class largest {
    public static int largest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(largest<arr[i]){
             largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,6,9};
        System.out.println("get largest:" + largest(arr));

    }
}
