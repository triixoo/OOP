package Homework4;

public class Chocolate extends Food {
    int weight;

    public Chocolate(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public double getCalories() {
        return weight * 740;
    }
    @Override
    public String toString() {
        return getName() + " " + getCalories();
    }

}
