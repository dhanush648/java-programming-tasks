import java.util.Scanner;
class duplicate
{
public static void main(String args[])
	{
		int n,i,j,k,count;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array ");
		n=scan.nextInt();
		int arr[]=new int[n];
		int arr2[]=new int[n];
		System.out.println("enter the elements ");
		for(i=0;i<n;i++)
			{
				arr[i]=scan.nextInt();
			}
		System.out.println("duplicates are");
		for(i=0,count=0;i<n;i++)
			{
				for(j=n-1;j>i;j--)
					{		
						if(arr[i]==arr[j])
							{	
								System.out.println(arr[i]);
								for(k=0;k<n;k++)
								{
									arr2[k]=arr[i];
								}
								break;
							}
					}
			}

	}
}