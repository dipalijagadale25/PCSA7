package string;

import java.util.Arrays;

public class Anagram { 
	public static void main(String[] args)
	{
		String s1="HEART";
		String s2="EARTH";
		char [] s3=s1.toCharArray();
		char s4[]=s2.toCharArray();
		
		
		Arrays.sort(s3);
		Arrays.sort(s4);
		if (s3.length==s4.length)
		{
			int count=0;
			for (int i = 0; i < s4.length; i++)
			{
				if (s3[i]==s4[i]) 
				{
					count++;
				}
				
			}
			if(count==s3.length)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("not anagram");
			}
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
		
			
		

	}
}
