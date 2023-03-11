import java.util.Arrays;
import java.util.Scanner;
public class Main8 {
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int i=0,j=0,sum=0,k=0;
        int[] num=new int[n];
        int[][] grade=new int[n][];
        int[] pai=new int[n];//用来排序的数组
        for(i=0;i<n;i++)
        {
            num[i]=cin.nextInt();
            grade[i]=new int[num[i]+1];//grade[][0]为平均数
            for(sum=0,j=1;j<=num[i];j++)
            {
                grade[i][j]=cin.nextInt();
                sum+=grade[i][j];
            }
            grade[i][0]=sum/num[i];
            pai[i]=grade[i][0];
        }
        for(i=n-1;i>=0;i--)
        {
            for(j=0;j<i;j++)
            {
                if(grade[j][0]>grade[j+1][0])
                {
                    int[] mid;
                    mid=grade[j];
                    grade[j]=grade[j+1];
                    grade[j+1]=mid;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=1;j<grade[i].length;j++)
            {
                System.out.printf("%d ",grade[i][j]);
            }
            System.out.printf("\n");
        }
        // Arrays.sort(pai);
        // for(i=0;i<n;i++)
        // {
        //     for(j=0;j<n;j++)
        //     {
        //         if(pai[i]==grade[j][0])
        //         {
        //             for(k=1;k<=num[j];k++)
        //             {
        //                 System.out.printf("%d ",grade[j][k]);
        //             }
        //             System.out.printf("\n");
        //         }
        //     }
        // }
        cin.close();
    }
}