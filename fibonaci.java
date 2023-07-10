import java.util.*;
public class fibonaci {
    public static void main(String[] args) {
       System.out.print("enter the number of term :");
       Scanner cc = new Scanner(System.in);
       int n = cc.nextInt();
       cc.close();
       int f_term = 0;
       int s_term = 1;
       if(n==1)
       System.out.print(f_term);
       else if(n==2)
       System.out.print(f_term + "," + s_term);
       else{
        System.out.print(f_term + "," + s_term + ",");
        for(int i = 3 ; i<= n ; i++){
            int next = f_term + s_term;
            System.out.print(next + ",");
            f_term = s_term;
            s_term = next;
        }
       } 
    }
}
