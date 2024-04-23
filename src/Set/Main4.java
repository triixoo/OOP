package Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Aslan", "Ibrayev", "25"));
        people.add(new Person("Balzhan", "Zhunusova", "20"));
        people.add(new Person("Chingis", "Kasymov", "35"));
        people.add(new Person("Dana", "Sultanova", "22"));
        people.add(new Person("Erlan", "Aidarov", "28"));
        people.add(new Person("Fatima", "Abilova", "31"));
        people.add(new Person("Gulnar", "Alibekova", "19"));
        people.add(new Person("Hakan", "Nurlybayev", "40"));
        people.add(new Person("Inkar", "Makpalov", "18"));
        people.add(new Person("Jansaya", "Doskhanova", "30"));

        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return Integer.compare(Integer.parseInt(p1.getAge()), Integer.parseInt(p2.getAge()));
            }
        });
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}

