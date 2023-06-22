import java.util.*;
public class fcatorial {
    public static int fact(int num){
        int f=1;
        for(int i = num; i>=1 ;i--){
            f=f*i;
        }
        return f;
    }

    public static void main(String arg[]){
        System.out.print("enetr the number to which the factorial you want to know : ");
        Scanner cc =new Scanner(System.in);
        int num = cc.nextInt();
        System.out.println("the factorial is : " + fact(num));
        cc.close();
    }
    
}
