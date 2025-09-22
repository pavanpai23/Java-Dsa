package BinarySearch;

public class InfiniteSortedArray {
    public static void main(String[] args) {

        int[] arr={2,4,6,8,9,10,12,13,25,65,87};
        int target=10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        //first find the range
        //first start with box of size 2;
        int start=0;
        int end=1;

        //condition for the target to lie in the range
        while(target>arr[end]){
            int newstart=end+1;
            //double the box value
            //end=previous end+size of box *2;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return BinarySearch(arr,target,start,end);
    }

        static int  BinarySearch(int[] arr,int target,int start,int end){
         int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return ans ;
    }
}
