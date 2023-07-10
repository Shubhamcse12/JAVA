import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int n = cc.nextInt();
        cc.close();
        int fact = 1;
        for(int i = 1 ; i <= n ; i++){
            fact = fact * i ;
        }
        System.out.println("The factorial is " + fact);

    }
}
