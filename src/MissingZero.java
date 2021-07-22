
public class MissingZero 
{

	public static void main(String[] args) 
	{
		int a[] = {2,0,0,0,0,1,0,0,0,1,5,0,0};
		int l=0;
		int i,j;
		
		for(i=0;i<a.length;i++)
		{
		if (a[i]!=0)
		{
			 l++;
		}
		}
		
		int ar[] = new int[l];
		
		for (i=0,j=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				ar[j]=a[i];
				j++;
			}
		}
		
		
		for ( i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+ " ");
		}

	}

}
