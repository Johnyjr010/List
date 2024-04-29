package List;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByKeys {

	 public static void main(String[] args) {
	        
	        HashMap<Integer, String> hashMap = new HashMap<>();
	     
	        hashMap.put(4, "Apple");
	        hashMap.put(2, "Banana");
	        hashMap.put(3, "Orange");
	        hashMap.put(1, "Grapes");
	  
	        LinkedHashMap<Integer, String> sortedMap = sortHashMapByKeys(hashMap);
	        
	 
	        System.out.println("Sorted HashMap by keys: " + sortedMap);
	    }
	    
	    public static LinkedHashMap<Integer, String> sortHashMapByKeys(HashMap<Integer, String> map) {

	        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);
	        
	       
	        LinkedHashMap<Integer, String> result = new LinkedHashMap<>();
	        
	
	        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
	            result.put(entry.getKey(), entry.getValue());
	        }
	        
	        return result;
	    }
}
