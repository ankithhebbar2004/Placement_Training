import java.util.HashMap;
import java.util.Map;

public class FuncParam {
    public static void main(String[] args) {
        Solu s = new Solu();
        Map<String,String> map;
        map = new HashMap<>();
        System.out.println("before: " + map);
        s.get(map);
        System.out.println("after: " + map);
        String name = map.get("name");
        String city = map.get("dept");
        System.out.println(name + " is of "+ city);

    }
}
class Solu{
    public void get(Map<String,String> map){
        map.put("name","John Smith");
        map.put("dept","Papa John");
    }
}
