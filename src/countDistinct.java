import java.util.*;
public class countDistinct {

	public static void main(String[] args) 
	{

       int ar[] = {0,1,2,3,4,6,5,7,8};
       
       HashMap<Integer,Integer> hm =  new HashMap<Integer,Integer>();
       
       for(int i=0;i<ar.length;i++)
       {
    	   hm.put(ar[i],i);
       }
		
       
       System.out.println(hm.keySet());
       System.out.println(hm.entrySet());
       System.out.println("Number of elemensts are :"+hm.size());
		
	}

}
