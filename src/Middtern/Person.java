package Middtern;

abstract class Person {
    protected String name;
    protected int age;
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void sleep();
    public abstract void run();
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
