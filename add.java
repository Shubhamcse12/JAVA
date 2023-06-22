import java.util.*;
public class add {
    public static void main(String[]args){
        System.out.println("enter the value of a");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("enter the value of b");
        int b= sc.nextInt();
        int sum =a+b;
        System.out.println(sum);
        sc.close();
    }
    
}
