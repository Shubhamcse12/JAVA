import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner cc = new Scanner(System.in);
        System.out.print("enter the no of term:");
        int n = cc.nextInt();
        cc.close();
        System.out.println("-------------------------->>> square pattern <<<-----------------------");
        for(int i = 0 ; i < n ; i++ ){
            for (int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("-------------------------->>>upward left half triangle pattern <<<-----------------------");

        for(int i = 0 ; i < n ; i++ ){
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("-------------------------->>>downward left half triangle pattern <<<-----------------------");

        for(int i = 0 ; i < n ; i++ ){
            for (int j = n; j > i; j--){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("-------------------------->>>upward right half triangle pattern <<<-----------------------");

        for(int i = 0 ; i < n ; i++ ){
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}