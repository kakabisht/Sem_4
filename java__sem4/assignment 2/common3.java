import java.util.*;
class common3
{
	public static void main(String args[])
	{
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements:\n");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(i==0)
			{
				if (arr[i]>arr[i+1])
				System.out.println("The corner peak element is:"+arr[i]);
			}
			if(i==(n-1))
			{
				if(arr[i]>arr[i-1])
				System.out.println("The other corner peak element is:"+arr[i]);
			}	
		}
		System.out.println("Peak Elements in the middle:\n");
		for(i=1;i<n-1;i++)
		{
			if(arr[i]>arr[i+1]&&arr[i]>arr[i-1])
			System.out.println(arr[i]); 
		}
	}
}