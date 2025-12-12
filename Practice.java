import java.util.*;

public class Practice{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        // int power = scan.nextInt();

        // long result = power(num, power);
        // System.out.println(result);

        int count = count_digits(num);
        System.out.println(count);
    } 

    static long power(int a, int x){
        if(x == 1) return a;
        long half = power(a, x/2);
        if(x % 2 == 0) return half * half;
        else return half * half * a;
    }

    static int count_digits(int num){
        if(num == 0) return 0;
        count_digits(num/10);
        int count += 1;
        return count;
    }
}