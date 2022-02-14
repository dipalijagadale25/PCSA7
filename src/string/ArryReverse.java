package string;
import java.util.Scanner;
public class ArryReverse {
	public static void main(String[] args) {
		
	
	Scanner s= new Scanner (System.in);
	System.out.println("Enter Element");
	int size=s.nextInt();
	
	int a[]=new int [size];
	
	System.out.println("Elements in the array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
	}
	System.out.println("----------------------------------------------------------");
	
	for(int k=a.length-1;k>=0;k--)
	{
		System.out.println(a[k]);
	}
}
}