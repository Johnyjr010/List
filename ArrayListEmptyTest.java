package List;

import java.util.ArrayList;

public class ArrayListEmptyTest 
{
	public static void main(String[] args) 
	{
        
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        
        if (isArrayListEmpty(list)) 
        {
            System.out.println("ArrayList is empty.");
        } 
        else 
        {
            System.out.println("ArrayList is not empty.");
        }
    }
    
    public static boolean isArrayListEmpty(ArrayList<?> list) 
    {
        return list.isEmpty();
    }

}
