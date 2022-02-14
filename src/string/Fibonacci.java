package string;

public class Fibonacci {
public static void main(String[] args) {
	int num=10;
	int a=0,b=1,c=0;
	System.out.println(a);
	int i=1;
	while(i<=10)
	{
		c=a+b;//.......>c=1
		System.out.println(c);
		i++;
		a=b;//a=1
		b=c;//b=1
	}
	
}
}
