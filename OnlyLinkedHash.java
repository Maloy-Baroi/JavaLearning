import java.util.LinkedHashMap;
import java.util.Map;

public class OnlyLinkedHash {
    public static void main(String[] args) {
        LinkedHashMap<String, Float> map = new LinkedHashMap<>();

// Adding elements to the map
        map.put("Ginger", 0.2F);
        map.put("Tea leaf", 0.7F);
        map.put("Suger", 0.1F);

// Iterating over the entries of the map
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("\nFor 2 \n");
        for (String i: map.keySet()) {
            System.out.println( i+ ": " + map.get(i));
        }

        int i = map.size();

        do {
            System.out.println("Where is my map?");
            i -= 1;
        }
        while (i >= 0);

    }
}




