package pratices;

public class ceiling {
    public static void main(String[] args) {

        char[] letters={'c','d','f','j'};
        char target='j';
        char ans=letters(letters,target);
        System.out.println(ans);

    }
    static char letters(char[] letters,char target){
        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return letters[start% letters.length];
    }
}
