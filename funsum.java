import java.util.*;
public class funsum {
    public static int sum (int a,int b){
        int sum =a+b;
        return sum;
    }
    public static void main(String arg[]){
        System.out.print("enter the value of a: ");
        Scanner cc =new Scanner(System.in);
        int a =cc.nextInt();
        System.out.print("enter the value of b: ");
        int b =cc.nextInt();
        cc.close();
        System.out.println("the sum is : "  + sum(a,b));
    }
}
