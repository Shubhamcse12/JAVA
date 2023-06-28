import java.util.*;
public class sod {
    public static void main(String args[]){
        System.out.print("enter the number :");
        Scanner cc = new Scanner(System.in);
        int number = cc.nextInt();
        cc.close();
        int sum =0;
        while(number>0){
            int temp = number%10;
            sum = sum + temp;
            number=number/10;
        }
        System.out.println(sum);
    }
    
}
