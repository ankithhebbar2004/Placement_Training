import java.util.Scanner;

public class classDesign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Number x = new Number(n);
        int sum = 0;
        while(!x.isZero()){
            sum += x.nextDigit();
        }
        System.out.println(sum);

    }
}

class Number {
    private int num;
    public Number(int n){
        num = n;
    }
    public int nextDigit(){
        int digit = num % 10;
        num = num / 10;
        return digit;
    }
    public boolean isZero(){
        return num==0;
    }
}