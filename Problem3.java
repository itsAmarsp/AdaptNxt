package exam;
import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int i=1; int j=0; int len;
		if(n%2==0)
		{
			len=n-1;
		}
		else
		{
			len=n;
		}
		int[]ar=new int[len];
		while(len!=0&&j<ar.length)
		{
			if(i%2==1)
			{
				ar[j]=i;
				len--;
				j++;
			}
			i++;
		}
		System.out.println(Arrays.toString(ar));
	}

}
