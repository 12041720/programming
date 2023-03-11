import java.util.Scanner;
public class Main3 {
    static int[] num=new int[5];
    static int sign;
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        int T=cin.nextInt();
        int i,j;
        for(i=0;i<T;i++)
        {
            for(j=0;j<5;j++)
            {
                num[j]=cin.nextInt();
            }
            sign=0;
            check(0,0);
            if(sign==0)
            {
                System.out.printf("NO");
            }
            if(i<T-1)
            {
                System.out.printf("\n");
            }
        }
        cin.close();
    }
    public static void check(int sum,int wtf)
    {
        if(sign==1)//已凑出24点
        {
            return;
        }
        else if(sum==24||((sum+num[wtf])==24)||((sum-num[wtf])==24))
        {
            System.out.printf("YES");
            sign=1;//能凑出24点
        }
        else
        {
            wtf++;
            if(wtf>=5)
            {
                return;
            }
            check(sum+num[wtf-1],wtf);
            check(sum,wtf);
            check(sum-num[wtf-1],wtf);
        }
    }
}