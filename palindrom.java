import java.util.*;
public class palindrom {
    public static void main(String arg[]){
        Scanner cc = new Scanner(System.in);
        int n = cc.nextInt();
        cc.close();
        int rev = 0;
        int temp = n;
        while(temp>0){
            int num = temp % 10;
            rev = rev*10 + num;
            temp=temp/10;
        }
        System.out.println(rev);
        if(n==rev)
        System.out.println("it's palindrome");
        else
        System.out.println("it's not a palindorme");
    }
}
