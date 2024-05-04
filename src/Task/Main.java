package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> name = new ArrayList<>();
        name.add(new Person("Shyngys", "Karaul", 18));
        name.add(new Person("Nurlan", "Tusupov", 45));
        name.add(new Person("Karaul", "Tusupov", 72));
        name.add(new Person("Diana", "Tusupova", 40));
        name.add(new Person("Didar", "Satybaldy", 18));
        name.add(new Person("Leo", "Messi", 40));
        name.add(new Person("Cristiano", "Ronaldo", 45));
        name.add(new Person("Zhanna", "Tusupova", 50));
        name.add(new Person("Nurila", "Tusupova", 38));
        name.add(new Person("Azamat", "Zarkeshev", 40));
        name.add(new Person("Mansur", "Karaul", 17));
        List<String> namesOver40 = name.stream()
                .filter(person -> person.getAge() > 40)
                .map(person -> person.getName())
                .collect(Collectors.toList());
        System.out.println("Имена людей старше 40-ка лет: " + namesOver40);
        List<String> namesWithSurnameEndingOnOvAndAge40 = name.stream()
                .filter(person -> person.getSurname().endsWith("ov") && person.getAge() == 40)
                .map(person -> person.getName())
                .collect(Collectors.toList());
        System.out.println("Имена людей с фамилиями на 'ov' и возрастом 40-ка лет: " + namesWithSurnameEndingOnOvAndAge40);
    }
}
