package string;

import java.util.Arrays;

public class Anagram2 {
	public static void main(String[] args) {
		String s1="Mother In Law";
		String str[] =s1.split(" ");
		
		Arrays.sort(str);
		
	
		for (int i = 0; i < str.length; i++)
		{
			System.out.println(str[i]);	
		}
		
	}

}
