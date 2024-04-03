package Middtern;

class Animal {
    protected String type;
    protected int age;

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String run() {
        System.out.println("Animal is running.");
        return null;
    }

    public void eat() {
        System.out.println("Animal is eating.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}

