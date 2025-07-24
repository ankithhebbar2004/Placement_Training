import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class arrraymods {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int[] nums = IntStream.of(arr).map((x) -> x*2).toArray();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(nums));
        String[] pro = {"Item A","Item B","Item C"};
        int[] price = {160,120,90};
        double d = 12.5 / 100;
        int[] discount = IntStream.of(price).map((x) -> (int) (x - x * d)).toArray();
//        for(int i=0;i<3;i++){
//            System.out.println(pro[i]);
//            System.out.println("was" + price[i]);
//        }
        System.out.println("Before "+ Arrays.toString(price));
        System.out.println("After " + Arrays.toString(discount));

    }
}
