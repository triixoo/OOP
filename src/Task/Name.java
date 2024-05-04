package Task;

import java.util.HashMap;
import java.util.Map;

public class Name {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();

        people.put("Medina", 28);
        people.put("Shyngys", 24);
        people.put("Timur", 30);
        people.put("Diana", 22);
        people.put("Nurlan", 31);
        people.put("Mansur", 25);
        people.put("Mailz", 29);
        people.put("Layer", 27);
        people.put("MESSI", 26);
        people.put("Lebron James", 32);


        for (String name : people.keySet()) {
            System.out.println(name);
        }
    }
}
