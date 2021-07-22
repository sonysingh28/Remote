import java.util.*;
public class maxmin 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of elements: ");
		int n=  sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println();
		System.out.print("Enter elements: ");
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        
        
        
        int mx=a[0]; int mn=a[0];

    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i]>mx)
    			mx=a[i];
    	}
    	
    	System.out.print("Maximum is :"+ mx);
    	System.out.println();
    	
    	
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i]<mn)
    			mn=a[i];
    	}
    	
    	System.out.println("Minimum is : " +mn);
    }
	
	
}
