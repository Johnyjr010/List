package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Item implements Comparable<Item> {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.price, other.price);
    }


    @Override
    public String toString() {
        return "Item{name='" + name + "', price=" + price + '}';
    }
}
class NameComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        return item1.getName().compareTo(item2.getName());
    }
}

 class SortArrayList {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Laptop", 1000));
        items.add(new Item("Phone", 500));
        items.add(new Item("Tablet", 700));
        items.add(new Item("Desktop", 1200));

    
        System.out.println("Sorting by price (using Comparable):");
        Collections.sort(items);
        System.out.println(items);

        System.out.println("\nSorting by name (using Comparator):");
        Collections.sort(items, new NameComparator());
        System.out.println(items);
    }
}
