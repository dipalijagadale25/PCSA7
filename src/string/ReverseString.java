package string;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ReverseString {

	public static void main(String[] args)
	{
		String s1="My Name Is Dipali";
		 String []str=s1.split(" ");
		 String rev="";
		 for (int i = 0; i < str.length; i++)
		 {
			rev = str[i]+" "+rev;
		 }
		 System.out.println(rev);
	}
}
