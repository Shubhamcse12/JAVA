import java.util.*;
public class us {
    public static void main(String[]args){
        System.out.println("eneter the number 1 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the number 2 : ");
        Scanner cc = new Scanner(System.in);
        int b = cc.nextInt();
        if(a==b){
            System.out.println("Both are equal");
        }
        else if (a>b){
            System.out.println("a is greater then b");
        }
        else{
            System.out.println("b is greater then a");
        }
        sc.close();
        cc.close();

    }
    
}
