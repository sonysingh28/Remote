
public class Comapre {

	public static void main(String[] args) 
	
	
	{
        String s = "SSonys";
        
        int c=0;
        
        char ch[] = s.toCharArray();
        
        for(int i=0;i<s.length();i++)
        {
        	for(int j=i+1;j<s.length();j++)
        	{
        		if(ch[i]!=ch[j])
        		{
        			c++;
        			System.out.println(ch[i]);
        			break;
        		}
        	}
        	
        	//System.out.println(ch[i]);
        	break;
        }
        
	}

}
