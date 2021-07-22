import java.util.*;
public class MissingElements {

	public static void main(String[] args) 
	{
		
		int ar[]= {1,3,5,7,9,10};
		int l=1;int h=10;
		printmis(ar,l,h);
	}
	
	
	public static void printmis(int a[],int l, int h)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		int c=0;
		for(int i=0;i<a.length;i++)
			hs.add(a[i]);
		for(int i=l;i<=h;i++)
		{
			if(!hs.contains(i))
			{
				System.out.print(i + " ");
				c++;
			}
		}
		
		System.out.println();
		
		System.out.print("Number of missing elements are :"+c);
		

}
	
}	
	
