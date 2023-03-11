import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
        double a,b,c,S,Area,x;
		a = cin.nextDouble();
        b=cin.nextDouble();
        c=cin.nextDouble();
        S=(a+b+c)/2;
        if((S<=a)||(S<=b)||(S<=c)||(a<=0)||(b<=0)||(c<=0))
        {
            System.out.println("The edges cannot make up of a triangle.");
        }
        else
        {
            x=S*(S-a)*(S-b)*(S-c);
            Area=Math.sqrt(x);
            System.out.printf("%.3f\n",Area);
        }
        cin.close();
	}
}