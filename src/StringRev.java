import java.util.*;
public class StringRev {

	public static void main(String[] args) 
	{
       String str;
       System.out.print("Enter the string:");
       Scanner sc = new Scanner(System.in);
       str= sc.nextLine();
       sc.close();
       StrReverse(str);
	}

	public static void  StrReverse(String s)
	{
		
		char ch[] = s.toCharArray();
		
		ArrayList<Character> li = new ArrayList<Character>();
		for(char c: ch)
			
			li.add(c);
		Collections.reverse(li);
		
		Iterator t =li.iterator();
		
		while(t.hasNext())
		{
			System.out.print(t.next());
		}
		
		
	}
	
}
