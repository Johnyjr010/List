package List;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertElementAtPosition 
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        System.out.println("Enter the element to insert:");
        int element = scanner.nextInt();
        System.out.println("Enter the position to insert:");
        int position = scanner.nextInt();
        
        insertElement(list, element, position);
        
        System.out.println("Updated LinkedList: " + list);
    }
    
    public static void insertElement(LinkedList<Integer> list, int element, int position) {
        if (position < 0 || position > list.size()) {
            System.out.println("Invalid position");
            return;
        }
        
        list.add(position, element);
    }

}
