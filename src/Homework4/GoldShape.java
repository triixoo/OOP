package Homework4;

public abstract class GoldShape {
    abstract double getVolume();

    double getPrice(){
    return getVolume() * 250 + 1200;
    }
}

