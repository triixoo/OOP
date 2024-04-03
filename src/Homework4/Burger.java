package Homework4;

public class Burger extends Food {
    int meatAmount;
    int meatType;

    public Burger(String name, int meatAmount) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    @Override
    public double getCalories() {
        if (meatType == 1) {
            System.out.println(meatAmount * 840);
        } else if (meatType == 2) {
            System.out.println(meatAmount * 560);
        }
        return 0;
    }


    @Override
    public String toString() {
        return getName() + " " + getCalories();
    }

}