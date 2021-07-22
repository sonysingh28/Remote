import java.util.*;
public class merge {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements 1st array: ");
		
		int n= s.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter elements in first array: ");
		
		for(int i=0;i<n;i++)
		{
			a[i]= s.nextInt();
		}

		
		System.out.print("Enter no. of elements in 2nd array: ");
		
		int n1= s.nextInt();
		int b[] = new int[n1];
		
		System.out.println("Enter elemenst in 2nd array : ");
		
		for(int i=0;i<n1;i++)
		{
			b[i]= s.nextInt();
		}
		
		
		int c[] = new int[a.length+b.length];
		int count=0;
		
		for (int i=0;i<a.length;i++)
		{
			c[i]= a[i];
			count++;
		}
		
		for (int i=0;i<b.length;i++)
		{
			c[count++]= b[i];
		}
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i] + " ");
		}
	}

}
