public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 1, 8};
        Soln s = new Soln();
        int max = s.getMax(arr);
        System.out.println(max);
    }
}
class Soln{
    public int getMax(int[] arr){
        int n = arr.length;
        return getMax(arr,n);
    }
    public int getMax(int[] arr,int n){
        if(n==0){
            return 0;
        } else if(n == 1){
            return arr[0];
        } else {
            int x = arr[n-1] + getMax(arr,n-2);
            int y = getMax(arr,n-1);
            return Math.max(x,y);
        }
    }
}
