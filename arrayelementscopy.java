import java.util.Scanner;
class arrayelements
{
public static void main(String args[])
	{
	int n,i;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of the array");
	n=scan.nextInt();
	int arr1[]=new int[n];
	int arr2[]=new int[n];
	System.out.println("enter the "+n+" number of elements");
	for(i=0;i<n;i++)
	{
		arr1[i]=scan.nextInt();
	}
	for(i=0;i<n;i++)
	{
		arr2[i]=arr1[i];
	}
	for(i=0;i<n;i++)
	{
		System.out.print(arr2[i]+" ");
	}
	}
}
