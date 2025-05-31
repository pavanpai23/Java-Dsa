package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={-18,-16,0,2,4,6,8,10,16,19,36,38,40};
        int target=36;
        int ans=OrderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int OrderAgnosticBS(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        //find weather the array is sorted in assending or desending order
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target) {
                return mid;
            }
                if(isAsc) {
                    if (target < mid) {
                        end = mid - 1;
                    } else{
                        start = mid + 1;
                    }
                        if (target > mid) {
                            end = mid + 1;
                        } else {
                            start = mid + 1;
                        }
                    }
                }
        return -1;
    }
}
