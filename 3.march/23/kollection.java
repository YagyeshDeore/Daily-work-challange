import java.util.*;

public class kollection {
    public static void main(String[] args) {
        // List: CRUD operations
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple"); // Create
        arrayList.add("Banana");
        System.out.println("ArrayList (Read): " + arrayList); // Read
        arrayList.set(1, "Cherry"); // Update
        System.out.println("ArrayList after update: " + arrayList);
        arrayList.remove("Apple"); // Delete
        System.out.println("ArrayList after deletion: " + arrayList);

        // Set: CRUD operations
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple"); // Create
        hashSet.add("Banana");
        System.out.println("HashSet (Read): " + hashSet); // Read
        hashSet.remove("Apple"); // Delete
        System.out.println("HashSet after deletion: " + hashSet);

        // Queue: CRUD operations
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple"); // Create
        queue.add("Banana");
        System.out.println("Queue (Read): " + queue); // Read
        queue.poll(); // Delete (removes head)
        System.out.println("Queue after poll: " + queue);

        // Deque: CRUD operations
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Apple"); // Create
        deque.addLast("Banana");
        System.out.println("Deque (Read): " + deque); // Read
        deque.removeLast(); // Delete
        System.out.println("Deque after removal: " + deque);

        // Map: CRUD operations
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple"); // Create
        hashMap.put(2, "Banana");
        System.out.println("HashMap (Read): " + hashMap); // Read
        hashMap.put(1, "Cherry"); // Update
        System.out.println("HashMap after update: " + hashMap);
        hashMap.remove(2); // Delete
        System.out.println("HashMap after deletion: " + hashMap);

        // SortedSet: CRUD operations
        SortedSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana"); // Create
        treeSet.add("Apple");
        System.out.println("TreeSet (Read): " + treeSet); // Read
        treeSet.remove("Apple"); // Delete
        System.out.println("TreeSet after deletion: " + treeSet);

        // SortedMap: CRUD operations
        SortedMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Cherry"); // Create
        treeMap.put(1, "Apple");
        System.out.println("TreeMap (Read): " + treeMap); // Read
        treeMap.put(1, "Banana"); // Update
        System.out.println("TreeMap after update: " + treeMap);
        treeMap.remove(3); // Delete
        System.out.println("TreeMap after deletion: " + treeMap);
    }
}
