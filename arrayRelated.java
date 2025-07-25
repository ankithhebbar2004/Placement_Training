public class arrayRelated {
    public static void main(String[] args) {
                   // 0  1  2  3  4
        int[] arr = {10,20,30,40,50};
        int n = arr.length;
        Parr p = new Parr();
        p.printArray4(arr,0);
    }
}
class Parr{
   public void printArray1(int[] arr,int n){
       if(n==0){
           return;
       } else{
           //System.out.println(arr[n-1]);
           printArray1(arr,n-1);
           System.out.println(arr[n-1]);
       }
   }
    public void printArray2(int[] arr,int n){
        if(n==0){
            return;
        } else{
            System.out.println(arr[n-1]);
            printArray1(arr,0);
            //System.out.println(arr[n-1]);
        }
    }
    public void printArray3(int[] arr,int index){
        if(index==arr.length){
            return;
        } else {
            System.out.println(arr[index]);
            printArray3(arr,index+1);
        }
    }
    public void printArray4(int[] arr,int index){
        if(index==arr.length){
            return;
        } else {
            printArray4(arr,index+1);
            System.out.println(arr[index]);
        }
    }
}
