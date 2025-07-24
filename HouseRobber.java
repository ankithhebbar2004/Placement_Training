import java.util.stream.IntStream;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2, 9, 5, 1, 8};
        Soln s = new Soln();
        int max = s.getMax(nums);
        System.out.println(max);
    }
}
class Soln{
    public int getMax(int[] nums){
        int n = nums.length;
        int[] memo = IntStream.generate(() -> -1).limit(n+1).toArray();
        return getMax(nums,n,memo);
    }
    public int getMax(int[] nums,int n,int[] memo){
        if(n==0)return 0;
        else if(n == 1) return nums[0];
        else if (memo[n] != -1) return memo[n];
        else {
            int x = nums[n-1] + getMax(nums,n-2,memo);
            int y = getMax(nums,n-1,memo);
            memo[n] = Math.max(x,y);
        }
        return memo[n];
    }
}
