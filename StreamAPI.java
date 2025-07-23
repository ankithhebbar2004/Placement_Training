import java.util.Arrays;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class StreamAPI {
    public static void main(String[] args) {
//        IntSupplier s = () -> 0;
//        IntStream stream = IntStream.generate(s).limit(7);
//        int[] arr = stream.toArray();
        IntStream.iterate(1,(x) -> x+1);
        int[] arr = IntStream.generate(() -> -1).limit(6).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
