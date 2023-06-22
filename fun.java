import java.util.*;
public class fun {
    public static void PrintMyName(String name){
        System.out.println(name);
    }
    public static void main(String arg[]){
        Scanner cc =new Scanner(System.in);
        String name = cc.nextLine();
        PrintMyName(name);
        cc.close();
    }
}
