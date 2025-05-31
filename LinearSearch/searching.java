package LinearSearch;

public class searching {
    public static void main(String[] args) {

        int [] num={1,34,23,19,43,-23,313,74,23};
        int target=19;
        int ans=LinearSearch(num,target);
        System.out.println(ans);
    }

    //search in the array :return the index if item found
    //otherwise if item not found return -1

    static int LinearSearch(int []array,int target){
        if(array.length==0){
            return -1;
        }
        //run a for loop
        for(int index = 0; index < array.length; index++) {
            //check for element at every index if it is =target
            int element=array[index];
            if(element==target) {
                return index;
            }
        }
        //this line will execte if none of the above line are excuted
        //hence the target not found
        return -1;
    }
}
