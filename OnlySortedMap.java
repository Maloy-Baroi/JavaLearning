import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class OnlySortedMap {
    public static void main(String[] args) {
        SortedMap<String, Float> map = new TreeMap<>();

// Adding elements to the map
        map.put("Ginger", 0.2F);
        map.put("tea", 0.7F);
        map.put("suger", 0.1F);

// Accessing elements of the map
        System.out.println(map.get("apple")); // Output: 1

// Iterating over the entries of the map
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
