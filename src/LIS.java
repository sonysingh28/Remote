import java.util.*;
public class LIS {

	public static void main(String[] args) 
	{
		Vector<Integer> seq = new Vector<Integer>();
		seq.add(10);
		seq.add(12);
		seq.add(4);
		
		printLIS(seq);
		
		
		
       }
	
	
	public static int printLIS(Vector<Integer> seq)
	{
		
		int n = seq.size();
		int L[][] = new int[n+1][n+1];
		
		Vector<Integer> s = new Vector<Integer>(seq);
		
		Collections.sort(s);
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if((i==0)||(j==0))
					L[i][j]=0;
				
				else if((seq.get(i-1))==(s.get(j-1)))
                      L[i][j]=L[i-1][j-1]+1;
				
				else 
					L[i][j]= Math.max(L[i-1][j],L[i][j-1]);
				
			}
			
			
		}
		
		return L[n][n];
		
	}

}
