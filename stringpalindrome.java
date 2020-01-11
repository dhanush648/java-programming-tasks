import java.util.Scanner;
class palindrome
{
public static void main(String args[])
	{	
		int i,j,length,count=0;
		String any=new String();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string:-");
		any=scan.nextLine();
		any=any.toLowerCase();
		any=any.replace(" ","");
		length=any.length();
		char arr[]=any.toCharArray();
		char reverse[]=new char[length];
		for(i=0,j=length-1;i<length;i++,j--)
		{
			reverse[i]=arr[j];
		}
		for(i=0;i<=length-1;i++)
		{
			if(arr[i]==reverse[i])
			{
			count++;
			}
		}
		if(count==length)
		{
			System.out.print("the given string is palindrome");
		}
		else
		{
			System.out.print("the given string is not palindrome");
		}
	}
}