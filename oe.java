import java.util.*;
public class oe {
    public static void main (String[]args){
        System.out.print("Input the number :");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        sc.close();
    }
}
