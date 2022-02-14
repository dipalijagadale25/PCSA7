package string;

public class DupArray {
	
	public static void main(String[] args) {
		
		String str = "JAVA PYthon SQL JAVA";
		String s[]=str.split(" ");
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		for (int i = 0; i < s.length-1; i++)
        {
            for (int j = i+1; j < s.length; j++)
            {
                if( (s[i].equals(s[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+s[j]);
                }
            }
        }
		
	}

}
