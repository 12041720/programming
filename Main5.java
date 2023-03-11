import java.util.Scanner;
public class Main5 {
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        int n=0,a=0,i=0,np=0;
        n=cin.nextInt();
        a=cin.nextInt();
        int[] num=new int[n];
        int[] num2=new int[n];
        for(i=0;i<n;i++)
        {
            num[i]=cin.nextInt();
            np=(i-a>=0)?(i-a):(n+i-a);
            num2[np]=num[i];
        }
        for(i=0;i<n-1;i++)
        {
            System.out.printf("%d ",num2[i]);
        }
        System.out.printf("%d\n",num2[n-1]);
        cin.close();
    }
}