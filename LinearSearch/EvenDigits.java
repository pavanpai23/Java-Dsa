package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
 int[] nums={2,321,3456,22,3,56,784};
       System.out.println(FindNumbers(nums));
        System.out.println(digits(-46543232));
    }
    static int FindNumbers(int[] nums){       //leetcode question
        int count=0;
        for(int num:nums){
            if(even(num)) {
                count++;
        }
    }
    return count;
    }
    //function to check whether it contains even digits or not
   static boolean even(int num){
     int NumberofDigits=digits(num);
     if(NumberofDigits %2 ==0){
         return true;
     }
     return false;
    }

    //count no. of digits in a number
    static int digits(int num) {

        //if no. is given in negative then
        if(num<0){
            num=num*-1;
        }

        if(num==0){
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}