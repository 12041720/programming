import java.util.Scanner;

public class Main2 {
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        int a,n,j,sign,i;
        double b;
        n=cin.nextInt();
        // System.out.printf("n=%d\n",n);
        int[] num=new int [n];
        for(i=0;i<n;i++)
        {
            a=cin.nextInt();
            while(a!=-1)
            {
                b=Math.sqrt(a);
                int bb=(int)b;
                // System.out.printf("b=%d\n",bb);
                for(j=2,sign=0;j<=bb;j++)
                {
                    if(a%j==0)//能整除
                    {
                        sign=1;
                        break;
                    }
                }
                if(sign==0||a==2)//不能整除
                {
                    num[i]=num[i]+1;
                }
                a=cin.nextInt();
            }
        }
        for(i=0;i<n-1;i++)
        {
            System.out.printf("%d\n",num[i]);
        }
        System.out.printf("%d",num[n-1]);
        cin.close();
    }
}