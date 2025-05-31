package BinarySearch;

import java.util.Arrays;
 import java.util.Scanner;
public class MountainArray {
    public static void main(String[] args) {

        int[] arr={1,2,3,5,6,4,2,1};
        int peakindex=Mountain(arr);
        System.out.println("Peak index:" +peakindex);
        System.out.println("peak elemnet:" +arr[peakindex]);
    }
    static int Mountain(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]) {
                //you are in decresing part of the array
                //this may be the ans but look at the left
                //this is why end not = mid-1
                end = mid;
            }else{
                //you are in the accending part of the array
                start=mid+1; //because wkt mid+1 element is > then mid element
            }
        }
        //in the end, start==end and pointing to the largest number because of 2 checks above
        //start and end are always try to find m,ax element in above 2 check
        //hence, when they are pointing to just one element, that is the max one, because that the checks says
        //more eloboration at every point of time for start and end,they have the best possible ans till that time
        //if we are saying only one item is remaining ,hence because of above line that is the best possible ans



        return start;   //or return end (because start==end)
    }
}
