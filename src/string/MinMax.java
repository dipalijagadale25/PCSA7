package string;

public class MinMax {
public static void main(String[] args)
{
int arr[]= {1,2,5,7,23};
int a=0;
for (int i = 0; i < arr.length; i++) {
	
	a=min(arr);
}
	System.out.println(a);
}

public static int max(int[]a)
{
int max=a[0];
for (int i = 0; i < a.length; i++) 
{
	if(a[i]>=max)
	{
		max=a[i];
	}
	
}	
  return max;
}

public static int min(int b[])
{
int min=b[0];
for (int i = 0; i < b.length; i++)
{
if(b[i]<=min)
{
min=b[i];	
}
}
return min;
}

}
