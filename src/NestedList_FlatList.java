import java.util.*;
public class NestedList_FlatList {

	public static void main(String[] args) 
	{
      List<List<Integer>>  NestedList = new ArrayList();
      List<Integer> list = new ArrayList();
      List<Integer> li = new ArrayList();
      list.add(10);
      list.add(12);
      
      
      li.add(24);
      li.add(28);
      
      li.addAll(list);
      
      NestedList.add(li);
      
      System.out.print(NestedList);
      
	    
	    

	}

}
