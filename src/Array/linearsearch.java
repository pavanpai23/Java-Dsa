package Array;

public class linearsearch {
    public static int linearsearch(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]==key){
               return i;
           }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={2,4,5,6,8,10,12,15,18,20};
        int key=10;

        int index=linearsearch(arr,key);
        if(index==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key  is at index:" + index);
        }
    }
}
