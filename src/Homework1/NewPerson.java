package Homework1;

public class NewPerson {
    public NewPerson() {
    }
    public static void main(String[] args) {
        Person nullname = new Person("Timur", "Yeslamgaliyev", 33, 72, "Male", "Kazakhstan");
        Person firstname = new Person("Ermek", ",Orazbay", 18, 64, "Male", "Kazakhstan");
        Person secondname = new Person("Vladimir", "Razvodovskyui", 177, 62, "Male", "Bahrein");
        System.out.println(nullname.toString());
        System.out.println(firstname.toString());
        System.out.println(secondname.toString());
    }
}