import java.util.Scanner;
class intpalindrome
{
public static void main(String args[])
	{
		int num,temp,rem,reverse=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any integer");
		num=scan.nextInt();
		temp=num;
		while(num>0)
		{
		rem=num%10;
		reverse=(reverse+rem)*10;
		num=num/10;	
		}
		reverse=reverse/10;
		if(temp==reverse)
		{
			System.out.print("the number is palindrome");
		}
		else
		{
			System.out.print("the number is not palindrome");
		}
	}
}