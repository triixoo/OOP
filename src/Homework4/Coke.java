package Homework4;

public class Coke extends Food {
    double volumeLiters;
    boolean isSparkling;

    public Coke(String name, double volumeLiters, boolean isSparkling) {
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    @Override
    public double getCalories() {
        if (isSparkling) {
            return volumeLiters * 400;
        }else return volumeLiters * 100;
    }

    @Override
    public String toString() {
        return getName() + " " + getCalories();
    }

}

