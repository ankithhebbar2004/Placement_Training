import java.util.Arrays;
import java.util.Comparator;

public class longestWordMethod {
    public static void main(String[] args) {
        String[] words = {"hello","programming","dancer"};
        Soln1 s4 = new Soln1();
        String longest = s4.longestWord(words);
        System.out.println(longest);
    }
}
class Soln1{
    public String longestWord(String[] words){
//        int i;
//        for (i=0;i<=words.length;i++){
//            if(words[i].length() > words[i+1].length()){
//                return words[i];
//            }
//        }
//        return null;
        Comparator<String> c;
        c = (x,y) -> x.length() - y.length();
        Arrays.sort(words,c);
        System.out.println(Arrays.toString(words));
        int n = words.length;
        return words[n-1];
    }
}
