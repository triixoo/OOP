package Midka;
interface Thinkable {
    void think();
}
interface Snoozable {
    void snooze();
}


 public class Person implements Thinkable, Snoozable, Comparable<Person> {

         String name;
         private String surname;
         private String citizenship;
         private int age;

    public Person() {
     }
    public Person(String name, String surname, String citizenship, int age){
         this.name = name;
         this.surname = surname;
         this.citizenship = citizenship;
         this.age = age;
     }

         @Override
         public String toString () {
         return "Person{" +
                 "name='" + name + '\'' +
                 ", surname='" + surname + '\'' +
                 ", citizenship='" + citizenship + '\'' +
                 ", age=" + age +
                 '}';
     }

     @Override
     public void think() {
         System.out.println(name + "is think");
     }

     @Override
     public void snooze() {
         System.out.println(name + "is snooze");
     }
     @Override
     public int compareTo(Person person) {
         return person.age = this.age;
     }
 }