package practice;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;
public class Collection {
	public static void main(String[] args) {
        // List example (ArrayList)
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple"); // Duplicates are allowed in a List

        System.out.println("List Example:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Set example (HashSet)
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicates are not allowed in a Set

        System.out.println("\nSet Example:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Map example (HashMap)
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Orange", 7);

        System.out.println("\nMap Example:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " units");
        }
        
        //Deque example (Arrayqueue)
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Orange");
        System.out.println("\ndeque Example:");
        for (String fruit : deque) {
            System.out.println(fruit);
        }

    }
}


