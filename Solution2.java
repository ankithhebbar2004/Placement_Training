// import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution2 {
    public int findMissingNumber(int[] nums){
        // Arrays.sort(nums);
        // if(nums[0] != 1){
        //     return 1;
        // }
        // for(int i=0; i<nums.length-1;i++){
        //     int diff = nums[i+1] - nums[i];
        //     if(diff > 1){
        //         return nums[i]+1;
        //     } else {
                
        //     }
        // }
        // return nums.length+1;
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum += nums[i];
        }
        return n*(n+1)/2-sum;
        // 1 2 3 5 6 7 8 9
        // boolean flag = false;
        // for (int x=1; x<nums.length+1; x++){
        //     for(int num: nums){
        //         if (x == num){
        //             flag = true;
        //             break;
        //         }
        //     }
        //     if(!flag){
        //         return x;
        //     }
        // }
        // interface Merwin {
        //     public int solve(int x, int y);
        // }
        // (x,y) -> 10;
    }
}
