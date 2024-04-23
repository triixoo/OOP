package Set;
import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();

        people.put("Yasmin", 28);
        people.put("Shyngys", 24);
        people.put("Timur", 30);
        people.put("Diana", 22);
        people.put("Nurlan", 31);
        people.put("Mansur", 25);
        people.put("George", 29);
        people.put("Helen", 27);
        people.put("Ian", 26);
        people.put("Julia", 32);


        for (String name : people.keySet()) {
            System.out.println(name);
        }
    }
}
