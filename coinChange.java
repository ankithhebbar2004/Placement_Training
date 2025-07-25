public class coinChange {
    public static void main(String[] args) {
        int[] coins = {2,5,10,20};
        int amount = 32;

        News n1 = new News();
        int ways = n1.countWays(coins,amount);
        System.out.println(ways);
    }
}
class News {
    public int countWays(int[] coins,int amount){
        return countWays(coins,amount,0);
    }
    public int countWays(int[] coins,int amount,int i){
        if(amount == 0)  return 1;
        if(amount<0 || i == coins.length) return 0;
        int val = coins[i];
        //give nth coin
        int x = countWays(coins,amount-val,i);
        int y = countWays(coins,amount,i+1);
        //skip nth coin
        return x+y;
    }
}
