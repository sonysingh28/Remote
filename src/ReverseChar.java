
public class ReverseChar {

	public static void main(String[] args) 
	{
		// Input string: a!!!b.c.d,e'f,ghi
		//Output string: i!!!h.g.f,e'd,cba
		
		
		String s = "a!!!b.c.d,e'f,ghi";
		String r= "";
		int l = s.length()-1;
		
		for (int i=l;i<=0;i--)
		{
			r= r+s.charAt(i);
		}
     System.out.print(r);
	}

}
