package List;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetToArrayList 
{

	public static void main(String[] args) 
	{
HashSet<String> hashSet = new HashSet<>();
        
       
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        
        ArrayList<String> arrayList = convertHashSetToArrayList(hashSet);
        
        System.out.println("ArrayList: " + arrayList);
    }
    
    public static <T> ArrayList<T> convertHashSetToArrayList(HashSet<T> set) {
        return new ArrayList<>(set);
    }

	}


