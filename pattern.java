import java.util.*;

public class pattern {
    public static void main(String args[]) {
        System.out.println("-------------------->SOLID RECTANGLE<---------------------");
        System.out.print("ENTER THE NUMBER OF ROWS : ");
        Scanner cc = new Scanner(System.in);
        int n = cc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("-------------------->HOLLOW RECTANGLE<---------------------");
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.print("\n");
            }
        }

        System.out.println("-------------------->HALF PYRAMID<---------------------");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("-------------------->INVERTED HALF PYRAMID<---------------------");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("-------------------->INVERTED HALF PYRAMID(ROTATED BY 180 DEGREE<---------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------->HALF PYRAMID with number<---------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }

        System.out.println("-------------------->INVERTED HALF PYRAMID with number<---------------------");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }

        System.out.println("-------------------->FLOUD'S TRIANGLE<---------------------");
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

        System.out.println("-------------------->0-1 TRIANGLE<---------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int x = i + j;
                if (x % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        System.out.println("-------------------->BUTTERFLY PATTERN<---------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces=2*(n-i);
            for(int j=1 ; j<=spaces; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print("*");
            }
            int space=2*(n-i);
            for(int j =space ;j>=1;j--){
                System.out.print(" ");
            }
            for(int j = n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        cc.close();
    }

}
