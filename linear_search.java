import java.util.Scanner;
public class linear_search {
    public static void main(String[] args) {
        int [] series = new int[20];
        System.out.println("enter the element of an array :");
        Scanner cc = new Scanner(System.in);
        for(int i = 0 ; i < 20 ; i++){
            series[i] = cc.nextInt();
        }
        System.out.print("enter the number you want to serch :");
        int num = cc.nextInt();
        cc.close();
        int time = 0;
        for(int i = 0 ; i < 20 ; i++){
            if(series[i]==num){
                time++;
                System.out.println("number at index " + i);
            }
        }
        if(time != 0)
        System.out.println("number found " + time + "times");
        else
        System.out.println("number didn't found");

    }
}
