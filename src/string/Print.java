package string;

import java.util.Scanner;

public class Print 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
	
	int a[]=new int[size];
	for (int i = 0; i < a.length; i++) 
	{
		System.out.println("ELEment in array");
		a[i]=sc.nextInt();
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
			
		}
	}
	
}

}
