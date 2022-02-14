package string;

public class CountNumInArray
{
	public static void main(String[] args)
	{
		String str = "JAVA PYthon SQL JAVA";
		String s[]=str.split(" ");
		
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
			System.out.println(cal(s[i]));
		}
		
	}
	public static int cal(String s2)
	{
		char [] ch=s2.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) 
		{
			//System.out.println(ch[i]);
			count++;
		}
		
	return count;
	}
}

