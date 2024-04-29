package List;

import java.util.Map;
import java.util.TreeMap;

public class IterateTreeMap {

	public static void main(String[] args) {
        
        TreeMap<String, Integer> treeMap = new TreeMap<>();
  
        treeMap.put("John", 25);
        treeMap.put("Alice", 30);
        treeMap.put("Bob", 35);
        treeMap.put("Emily", 28);

        System.out.println("Iterating through TreeMap using entrySet():");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
 
        System.out.println("\nIterating through TreeMap using keySet():");
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

        System.out.println("\nIterating through TreeMap using forEach() method:");
        treeMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
