package Homework4;

public class CubeGold extends GoldShape{
    double side;

    public CubeGold(double side) {
        super();
        this.side = side;
    }

    @Override
    double getVolume() {
        return Math.pow(side, 3);
    }
}
