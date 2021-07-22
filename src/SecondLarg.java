import java.util.*;
public class SecondLarg {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements: ");
		int n= s.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]= s.nextInt();
		}
       
		
		int m1= a[0];
		int m2=a[1];
		
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>m2)
				
			{
				m2=a[i];
			}
		
		
		if(m2>m1)
		{
			int tmp =m1;
			m1= m2;
			m2=tmp;
		}

		}
		
	    System.out.print("Second largest element is : " +m2);

	}

}
