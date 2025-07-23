public class Main{
    public static void main(String[] args) {
//    //              0  1  2  3  4  5   6
//       int[] nums = {10,20,30,40,50,60,70};
//       int n = nums.length;
        //Method 1
        //10 70
        //20 60
        //30 50
        //40
        //for (int i = 0; i <= n/2 - 1  ; i += 1){
        //     int a =  nums[i];
        //     System.out.print(a + " ");
        //     if (i+1 < n){
        //         int b = nums[n-i-1];
        //         System.out.println(b);
        //  }
        //}
        //Method 2
        // 10 20
        // 10 30
        // 10 40
        // 10 50
        // 10 60
        // 10 70
//        for (int i=1;i<n-1;i++){
//            System.out.println(nums[1] + " " + nums[i+1]);
        // if(i == (n/2)-1 && n%2 != 0){
        //     System.out.println(nums[i+1]);
        // }
//        }
//    }
//}
// TWO SUM
// for(int i=0;i<n-1;i++){
//     for(int j=i+1;j<n;j++){
//         int a = nums[i];
//         int b = nums[j];
//         if(a+b == target){
//             return new int[] {i,j};
//         }
        int num = 22;

        Solution1 s1 = new Solution1();
        String rev = s1.bin(22);

        System.out.print(rev);
    }
}
class Solution1{
    public String bin(int num) {
        if(num==0) return "";
        return bin(num/2) + (num%2);                  // 22 -> 11 -> 5 -> 2 -> 1 -> 0
    }                                                      // 1 0 1 1 0
}                                                          //

