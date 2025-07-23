import java.time.LocalDate;
import java.util.*;

public class Day5 {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> list;
        list = new ArrayList<>();
        for (int i=1;i<=12;i += 1){
            list.add(r.nextInt(10));
        }
          System.out.println(list);
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
        for (int val : new HashSet<>(list)){
//            int count = 0;
//            for (int num: list){
//                if(num == val) {
//                    count += 1;
//                }
//            }
            int count = Collections.frequency(list,val);
            //LocalDate
            System.out.println(val + "-" + count);
        }
    }
}
