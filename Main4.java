import java.util.Arrays;
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        int i=0,sum=0;
        int n=cin.nextInt();
        int minclass=(n%2==0)?(n/2):(n/2+1);
        int[] num=new int[n];
        for(i=0;i<n;i++)
        {
            num[i]=cin.nextInt();
        }
        Arrays.sort(num);
        for(i=0;i<minclass;i++)
        {
            int j=(num[i]%2==0)?(num[i]/2):(num[i]/2+1);
            sum+=j;
        }
        System.out.print(sum);
        cin.close();
    }
}