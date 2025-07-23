import java.util.Arrays;
import java.util.Random;

public class MostOccuredNo {
    public static void main(String[] args) {
        Random r = new Random();
        int[] nums = new int[12];
        for (int i=0;i<nums.length; i += 1){
            nums[i] = r.nextInt(10);
        }
        Solution s = new Solution();
        //int mode = s.mode(nums);
        System.out.println(Arrays.toString(nums));
        //System.out.println(mode);

    }
}
