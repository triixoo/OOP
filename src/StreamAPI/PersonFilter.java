package StreamAPI;
import java.util.ArrayList;
import java.util.List;
public class PersonFilter {
    public List<Person> filterPersons(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.getCity().equals("Almaty") && person.getAge() > 18)
                .toList();
    }

    public static class Main {
        public static void main(String[] args) {
            List<Person> persons = new ArrayList<>();
            persons.add(new Person("Timur", 40, "Almaty"));
            persons.add(new Person("Shyngys", 19, "Karagandy"));
            persons.add(new Person("Didar", 19, "Almaty"));
            PersonFilter personFilter = new PersonFilter();
            List<Person> filteredPersons = personFilter.filterPersons(persons);
            System.out.println("Filtered Person");
            for (Person person : filteredPersons) {
                System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() + ", City: " + person.getCity());
            }
        }
    }
}
