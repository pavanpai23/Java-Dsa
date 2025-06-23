package BinarySearch;

public class RotatedBS {
    public static void main(String[] args) {

        int[] arr={4,5,6,7,0,1,2};
        System.out.println(FindPivot(arr));

    }

    static int search(int[] num,int target){
        int pivot=FindPivot(num);

        //if u didnt find the pivot , it mean array is not rotated

        if(pivot==-1){
            //just do normal bs
            return BinarySearch(num,target,0,num.length-1);
        }
      //if pivot is found ,u have found 2 assending sorted array
        if(num[pivot]==target){
            return pivot;
        }
        if(target>num[0]){
            return BinarySearch(num,target,0,pivot-1);
        }
        return BinarySearch(num,target,pivot+1,num.length-1);
    }

    static int BinarySearch(int[] arr,int target,int start,int end){
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
        return -1;
    }





    static int FindPivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            //4cases over here
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;

    }
}
