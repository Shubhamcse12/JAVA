import java.util.*;
public class armstrong {
    public static void main(String args[]){
        System.out.println("enter the digit or number :");
        Scanner cc = new Scanner(System.in);
        int number = cc.nextInt();
        cc.close();
        int term =0;
        while(number>0){
            term = term + 1;
            number=number/10;
        }
        

    }
    
}
