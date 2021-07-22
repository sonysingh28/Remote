//Given an array of strings strs, group the anagrams together
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
import java.util.*;
public class Anagram {

	public static void main(String[] args) 
	{
		String ar[] = { "cat", "dog", "god" , "ogd"};
		printAnagrams(ar);
		
	}
	
	
	public static void printAnagrams(String ar[])
	{
		HashMap<String, List<String>> hm = new HashMap();
		
		for(int i=0;i<ar.length;i++)
		{
			String word = ar[i];
			char letters[] = word.toCharArray();
			Arrays.sort(letters);
			
			String newWord = new String(letters);
			
			
			if(hm.containsKey(newWord))
			{
				hm.get(newWord).add(word);
			}
			
			else
			{
				List<String> words = new ArrayList<>();
				
				words.add(word);
				
				hm.put(newWord,words);
				
				
			}
			
		}
		
		for(String s : hm.keySet())
		{
			List<String> values = hm.get(s);
			
			if(values.size()>1)
			{
				System.out.println(values);
			}
			
		}
		
		
		
	}

}
