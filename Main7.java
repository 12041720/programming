import java.util.Scanner;
public class Main7 {
    public static void main(String[] args)
    {
        int i=0,j=0,k=0;
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int[][] num=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                num[i][j]=0;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)//先竖列赋值
            {
                k++;//k为应赋的值
                num[j][i]=k;
            }
            for(int s=i-1;s>=0;s--)//再横向向右赋值
            {
                k++;
                num[j-1][s]=k;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.printf("\n");
        }
        cin.close();
    }
}