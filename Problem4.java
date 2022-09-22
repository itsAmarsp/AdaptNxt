package exam;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the size of the array");
     int n=sc.nextInt();
     int []ar=new int[n];
     System.out.println("enter "+ n +"elements");
     for(int i=0;i<n;i++)
     {
    	 ar[i]=sc.nextInt();
     }
     for(int i=1;i<=9;i++)
     {
    	 int count=getCount(i,ar);
    	 System.out.println(i+":"+count);
     }
     
	}
	static int getCount(int n,int[] ar)
	{
		int c=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%n==0)
				c++;
		}
		return c;
	}

}
