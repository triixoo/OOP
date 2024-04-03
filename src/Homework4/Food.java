package Homework4;

public abstract class  Food {
    String name;
    public Food(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract double getCalories();
}

