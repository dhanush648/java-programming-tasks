import java.util.Scanner;
import java.lang.*;
class armstrong
{
public static void main(String args[])
	{
		int num,temp2,r=0;
		int temp,count=0,i;double sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any integer");
		num=scan.nextInt();
		temp=num;
		temp2=num;
		while(temp2>0)
			{
				temp2=temp2/10;
				count++;
			}	
		while(temp>0)
			{
				r=temp%10;
				sum=sum+(Math.pow(r,count));
				temp=temp/10;
			}
		if(sum==num)
			{
				System.out.println(num+" is armstrong number");
			}
		else
			{
				System.out.println(num+" is not an armstrong number");
			}
	}
}