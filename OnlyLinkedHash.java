import java.util.LinkedHashMap;
import java.util.Map;

public class OnlyLinkedHash {
    public static void main(String[] args) {
        LinkedHashMap<String, Float> map = new LinkedHashMap<>();

// Adding elements to the map
        map.put("Ginger", 0.2F);
        map.put("Tea leaf", 0.7F);
        map.put("Suger", 0.1F);

// Accessing elements of the map
        System.out.println(map.get("apple")); // Output: 1

// Iterating over the entries of the map
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
