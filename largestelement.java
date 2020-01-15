import java.util.Scanner;
class large
{
public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		int i,max=0;
		System.out.println("enter the elements");
		for(i=0;i<n;i++)
		{	
			arr[i]=scan.nextInt();
		}
		max=arr[0];
		for(i=1;i<n;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.print("maximum element in the entered array is "+max);
	}
}
