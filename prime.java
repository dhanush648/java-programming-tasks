import java.util.Scanner;
class prime
{
public static void main(String args[])
	{
		int num,i,count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any integer");
		num=scan.nextInt();
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
			count++;
			}
		}
		if(count<2)
		{
			System.out.println(num+" is prime number");
		}
		else
		{
			System.out.println(num+" is not a prime number");	
		}
	}
}
