package Middtern;

public class Alligator extends Animal{
    public Alligator(String type, int age) {
        super(type, age);
    }

    @Override
    public String run() {
        return "Alligator" + super.toString();
    }
}
class Camel extends Animal {
    public Camel(String type, int age) {
        super(type, age);
    }

    @Override
    public String toString() {
        return "Camel " + super.toString();
    }
}

class Eagle extends Animal {
    public Eagle(String type, int age) {
        super(type, age);
    }

    @Override
    public String toString() {
        return "Eagle " + super.toString();
    }
}
