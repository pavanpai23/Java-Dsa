package LinearSearch;

public class SearchinRange {
    public static void main(String[] args) {
    int[] arr={14,34,23,3,132,43,2,34,4,3,32,1233};
    int target=3;
        System.out.println(LinearSearch(arr,target,1,4));
    }
    static int LinearSearch(int[] arr,int target,int start,int end ){
        if(arr.length==0){
            return -1;
        }
        for (int index = start; index <=end ; index++) {
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
