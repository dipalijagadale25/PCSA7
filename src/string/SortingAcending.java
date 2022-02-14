package string;

import java.util.Scanner;

public class SortingAcending {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr size");
		int size= sc.nextInt();
		
		int a[]=new int [size];
		System.out.println("elemet to enter in arry");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
			for (int j = 0; j < a.length; j++) 
			{
	
			System.out.println(a[j]);	
			}
		}
		
		System.out.println("----------------------------------");
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
				
			}
		}
			for (int j = 0; j < a.length; j++) {
				System.out.println("Sorted Array"+a[j]);
			}
		
	}
	
	

}
