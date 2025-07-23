import java.util.*;
import java.util.stream.IntStream;

public class Solution{
//    public int[] getSum(int[] nums,int target){
//        int[] arr = Arrays.copyOf(nums, nums.length);
//
//        Arrays.sort(arr);
//        int i=0,j=arr.length-1;
//
//        while(arr[i]+arr[j] != target){
//            if(arr[i]+arr[j]<target){
//                i++;
//            } else {
//                j++;
//            }
//        }
//
//        int a = arr[i];
//        int b = arr[j];
//        int k,l;
//
//        for (k=0;k<nums.length;k++){
//            if(nums[k] == a){
//                break;
//            }
//        }
//        for (l=nums.length;l>=0;l--){
//            if(nums[l] == b){
//                break;
//            }
//        }
//        return new int[] {k,l};
//         public int mode(int[] nums){
//             int maxval=0;
//             int maxfreq = 0;
//
//             List<Integer> lists = new ArrayList<>();
//             for (int i : nums){
//                 lists.add(i);
//             }
//
//             for (int val : new HashSet<>(lists)){
//                 int count = Collections.frequency(lists,val);
//                 System.out.println(val + "-" + count);
//                 if(count > maxfreq){
//                     maxfreq = count;
//                     maxval = val;
//                 }
//             }
//             return maxval;
//             for (int num : nums){
//                 if(!lists.contains(num)){
//                     lists.add(num);
//                 }
//             }
             //int[] arr = IntStream.of(nums).distinct().toArray();
//         }
//    }
//    public int fun (int[] n){
//        return 0;
//    }
}
