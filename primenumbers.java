import java.util.Scanner;
class primenumbers
{
public static void main(String args[])
	{
		int count=0,limit,i,j;
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the limit:- ");
		limit=scan.nextInt();
		System.out.println("prime numbers are ");
		for(i=2;i<limit;i++)
		{			for(j=1,count=0;j<limit;j++)
			{
				if(i%j==0)
				{
					count++;

				}	
			}
			if(count<=2)
			{
				System.out.print(" "+i);
			}
		}
	}
}