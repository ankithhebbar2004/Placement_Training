public class coinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;

        News n1 = new News();
        int ways = n1.countWays(coins,amount);
        System.out.println(ways);
    }
}
class News {
    public int countWays(int[] coins,int amount){
        return countWays(coins,amount,coins.length);
    }
    public int countWays(int[] coins,int amount,int n){
        if(amount == 0) {
            return 1;
        } if(amount<0){
            return 0;
        } else if(n == 0){
            return 0;
        }  else {
            int val = coins[n-1];
            //give nth coin
            int x = countWays(coins,amount-val,n);
            int y = countWays(coins,amount,n-1);
            //skip nth coin
            return x+y;
        }
    }
}
