package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {

        int[][]amount={
                {1,2,3},
                {3,2,1}
        };
        int ans=maximumwealth(amount);
        System.out.println(ans);

    }
    static int maximumwealth(int [][] accounts){
        int MaxWealth=Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            //when you take a new col , take a new sum for that row
             int sum=0;
            for (int account = 0; account <accounts[person].length ; account++) {
                sum+=accounts[person][account];

            }
            //now we have sum of accounts of person
            //check with overall ans
            if(sum>MaxWealth){
                 MaxWealth=sum;
            }

        }
        return MaxWealth;
    }
}
