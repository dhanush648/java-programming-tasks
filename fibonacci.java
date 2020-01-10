import java.util.Scanner;
class fibonacci
{
public static void main(String args[])
	{
		int limit,num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the limit");
	 	limit=scan.nextInt();
		System.out.println("Fibonacci series is ");
		for(num1=1;num1<limit;)
		{
			num2=num1;
			System.out.print(num1+" ");
			num1=num2+num1;
		}
	}
}