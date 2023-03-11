import java.util.Scanner;
public class Main6 {
    public static void main(String[] args)
    {
        int i=0;
        Scanner cin=new Scanner(System.in);
        String a=cin.next();
        int[] num=new int[26];//数组num[]记录字母出现次数
        for(i=0;i<26;i++)
        {
            num[i]=0;
        }
        for(i=0;i<a.length();i++)
        {
            ++num[a.charAt(i)-'a'];
        }
        for(i=0;i<26;i++)
        {
            if(num[i]>0)
            {
                System.out.printf("%c:%d\n",i+'a',num[i]);
            }
        }
        cin.close();
    }
}