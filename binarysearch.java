import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        System.out.print("enter the size of array");
        Scanner cc = new Scanner(System.in);
        int n = cc.nextInt();
        int [] series = new int[n];
        System.out.println("enter the element of serie");
        for(int i = 0; i < n; i++){
            series[i] = cc.nextInt();
        }
        System.out.println("enter the number you want to search:_");
        int num = cc.nextInt();
        cc.close();
        int beg = 0;
        int mid;
        int pos= -1;
        int end = n-1;
    while (beg<=end)
    {
        mid=(beg+end)/2;
        if(series[mid]==num)
        {
            pos=mid;
            break;
        }
        else if(series[mid]<num)
        beg=mid+1;
        else
        end=mid-1;
    }
    if(pos==-1)
            System.out.println("entered number is not present");
    else
            System.out.println("number found");
}
}
