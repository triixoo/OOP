package Homework4;

public class SphereGold extends GoldShape{
    double radius;
    public SphereGold(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
