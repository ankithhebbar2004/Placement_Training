public class lengthBreadth {
    public static void main(String[] args) {
//        Fruits f = new Fruits();
//        for (int i=1;i<=10;i++){
//            String name = f.nextName();
//            System.out.print(name + " ");
//        }
          NumberIterator it = new NumberIterator(9);
          while (it.hasNext()) {
              int n = it.next();
              System.out.print(n + " ");
          }
    }
}
class NumberIterator{
//    int i=0;
//    String[] a = {"Apple","Grapes","Mango"};
//    public String nextName(){
//        return a[i++ %3]
    private int y;
    public NumberIterator(int x){
        this.y = x;
    }
    int i=0;
    public boolean hasNext(){
        i++;
        return i <= y;
    }
    public int next(){
        return i;
    }
}