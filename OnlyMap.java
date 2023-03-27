import java.util.HashMap;
import java.util.Map;

public class OnlyMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

// Adding elements to the map
        map.put("apple", 1);
        map.put("licchi", 2);
        map.put("orange", 3);

// Iterating over the entries of the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
