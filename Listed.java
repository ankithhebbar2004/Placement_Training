import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listed {
    public static void main(String[] args) {
        //Object s = new String("Hello");
        //System.out.println(((String)s);
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(25);
        list.add(7);
//        System.out.println(list.size());
        list.add(25);
        list.add(7);
        Iterator<Integer> it = list.iterator();
//        System.out.println(list.size());
//        System.out.println(list.get(4));
        while(it.hasNext()) {
            int x = it.next();
            System.out.print(x + " ");
        }

//        Integer x = 25; //autoboxing
//        int y = x;

    }
}
//class NMAMList{
//    private int[] arr;
//    private int count;
//
//    public NMAMList() {
//        this.arr = new int[10];
//        this.count = 0;
//    }
//    public void add (int n){
//        this.arr[count] = n;
//        this.count += 1;
//    }
//    public int size () {
//        return count;
//    }
//    public int get (int n) {
//        return arr[n];
//    }
//}
