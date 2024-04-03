package Midka;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Didar", "Satybaldy", "Kz", 18);
        Person person2 = new Person("Talgat", "Mustafinov", "Kz", 17);
        Person person3 = new Person("Ermek", "Orazbay", "Kz", 18);
        Person person4 = new Person("Shyngys", "Karaul", "Kz", 18);
        Person person5 = new Person("Rashiden", "Rahimzhan", "Kz", 18);
        Person[] people = {person1, person2, person3, person4, person5};
        Arrays.sort(people);
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
