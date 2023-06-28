import java.util.Scanner;
public class middle {
    public static void main(String[] args) {
        Scanner cc=new Scanner (System.in);
        int t=cc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=cc.nextInt();
            int b=cc.nextInt();
            int c=cc.nextInt();
            if(a>b){
            if(a>c)
            System.out.println(c);
            else
            System.out.println(a);
        }
        else{
            if(b>c)
            System.out.println(c);
            else
            
            System.out.println(b);
        }
        }
        cc.close();
    }
    
}
