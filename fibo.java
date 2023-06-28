import java.util.*;
public class fibo {
    public static void main(String args[]){
        System.out.print("enter the no. of term : ");
        Scanner cc = new Scanner(System.in);
        int n = cc.nextInt();
        cc.close();
        int first = -1;
        int second = 1;
        if( n==1)
        System.out.println("0");
        else if(n==2)
        System.out.print("0, 1");
        else{
            for(int i = 1; i<= n; i++){
                int temp = first + second;
                System.out.print(temp + ", ");
                first = second;
                second = temp;
            }
        }


        System.out.println("second method try");

        for(int i = 1; i<= n; i++){
                int temp = first + second;
                System.out.print(temp + ", ");
                first = second;
                second = temp;
            }
    }
    
}
