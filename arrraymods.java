import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class arrraymods {
    public static void main(String[] args) {
        int[] arr = {25,18,5,40,32,2,19,45};
//        int[] nums = IntStream.of(arr).map((x) -> x*2).toArray();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(nums));
//        String[] pro = {"Item A","Item B","Item C"};
//        int[] price = {160,120,90};
//        double d = 12.5 / 100;
//        int[] discount = IntStream.of(price).map((x) -> (int) (x - x * d)).toArray();
//        for(int i=0;i<3;i++){
//            System.out.println(pro[i]);
//            System.out.println("was" + price[i]);
//        }
        int[] res = IntStream.of(arr).filter(Prime::isOdd).toArray();  //This is called as the method reference
        System.out.println("Before "+ Arrays.toString(arr));
        System.out.println("After " + Arrays.toString(res));
    }
}
class Prime {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean isOdd(int num){
        if(num>=10 && num<=30){
            if(num % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}