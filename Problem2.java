package exam;
import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the length");
     
     int len=sc.nextInt();
     String st="";
     int i=1;
     int n=len;
     int[ ] ar=new int[len];
     int j=0;
     while(n!=0&&j<ar.length)
     {
    	 if(i%2==1)
    	 {
    		 ar[j]=i;
    		 n--;
    		 j++;
    	 }
    	 i++;
     }
     System.out.println(Arrays.toString(ar));
     
	}

}
