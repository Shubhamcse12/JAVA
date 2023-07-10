import java.util.*;
import java.lang.Math;
public class armstrong {
    public static void main(String[] args) {
        System.out.print("enter the number:");
        Scanner cc = new Scanner(System.in);
        int n = cc.nextInt();
        cc.close();
        double term = 0.0;
        double temp = n;
        while(temp>0){
            term++;
            temp = temp/10;
        }
        System.out.println(term);
        double i = 0.0;
        while(temp>0){
            double dig = temp%10;
            double po = Math.pow(dig,term);
            System.out.println(po);
            i = i + po;
            temp = temp/10;
        }
        System.out.println(i);
        if(i==n)
        System.out.println("it's armstrong");
        else
        System.out.println("it,s not armstrong");
    }
    
}
