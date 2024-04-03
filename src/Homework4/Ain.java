package Homework4;
public class Ain {
    public static void main(String[] args) {
        GoldShape[] goldShapes = new GoldShape[6];

        goldShapes[0] = new SphereGold(3.2);
        goldShapes[1] = new SphereGold(5.5);
        goldShapes[2] = new SphereGold(11.3);
        goldShapes[3] = new CubeGold(4.42);
        goldShapes[4] = new CubeGold(7.31);
        goldShapes[5] = new CubeGold(13.42);

        for (GoldShape goldShape : goldShapes) {
            System.out.println("Price: " + goldShape.getPrice());
        }
    }
}
