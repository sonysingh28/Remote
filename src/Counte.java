
public class Counte {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s ="Sony Singh";
		
	    char ch[] = s.toCharArray();
		
		int l= s.length()-1;
		
		for(int i=0;i<l;i++)
		{
			
			for(int j=i;j<l;j++)
				
			{
				 int c=0;
				if (ch[i]==ch[j])
				{
					c++;
					System.out.println(ch[i]+" : "+ c);
				}
				
				/*if(c==0)
				{
					System.out.println(ch);
				}*/
			}
			
		}
	}

}
