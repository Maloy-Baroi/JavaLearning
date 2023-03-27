import java.util.HashMap;
import java.util.Map;

public class OnlyHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the map
        map.put("Maloy", 24);
        map.put("Pial", 23);
        map.put("Rana", 24);
        map.put("Evana", 24);
        map.put("Anannya", 24);

        // Iterating over the entries of the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
