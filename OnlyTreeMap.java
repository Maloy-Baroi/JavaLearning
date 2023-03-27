import java.util.Map;
import java.util.TreeMap;

public class OnlyTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Float> tea = new TreeMap<>();

// Adding elements to the map
        tea.put("Ginger", 0.2F);
        tea.put("tea leaf", 0.7F);
        tea.put("sugar", 0.1F);


// Iterating over the entries of the map
        for (Map.Entry<String, Float> entry : tea.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
