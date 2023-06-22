import java.util.*;
public class calculator {
    public static void main(String arg[]){
        System.out.println("Enter 1 for ADDITION");
        System.out.println("Enter 2 for SUBTRACTION");
        System.out.println("Enter 3 for MULTIPLICATION");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for EVEN or ODD");
        System.out.println("enter 6 for ");
        System.out.println("enter 7 for ");
        System.out.println("enter 8 for ");
        System.out.println("enter 9 for ");
        System.out.println("enter 10 for ");
        System.out.println("enter 11 for ");
        System.out.println("enter 12 for ");
        Scanner cc = new Scanner(System.in);
        System.out.print("CHOOSE FROM ABOVE OPTION =");
        int option =cc.nextInt();
        System.out.print("ENTER THE VALUE OF a:");
        int a = cc.nextInt();
        System.out.print("ENTER THE VALUE OF b:");
        int b = cc.nextInt();
            if(option>=1 && option <= 6){
        switch(option){
            case 1: int sum =a+b;
            System.out.println("SUM OF a AND b is : " + sum);
            break;
            case 2: int sub = a-b;
            System.out.println("SUBTRACTION OF a AND b is : " + sub);
            break;
            case 3: int cross = a*b;
            System.out.println("MULTIPLICATION OF a AND b is : " + cross);
            break;
            case 4: int div = a/b;
            System.out.println("DIVISION OF a AND b is : " + div);
            break;  
            case 5: if(a%2==0)
                    System.out.println("a is even");
                    else
                    System.out.println("a is odd");
                    if(b%2==0)
                    System.out.println("b is even");
                    else
                    System.out.println("b is odd");
            break;
            case 6: if(a>b)
                    System.out.println("a IS GREATEST NO.");
                    else 
                    System.out.println("b IS GREATEST NO.");
            break;
            default: System.out.println("INVALID OPTION");
        }
    }
    else{
        System.out.println("INVALID OPTION CHOOSEN");
    }
    cc.close();
    }      
}
    


