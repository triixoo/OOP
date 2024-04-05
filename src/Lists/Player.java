package Lists;

import java.util.ArrayList;

public class Player {
    private String name;
    private double price;
    private int age;
    public Player(String name, double price, int age) {
        this.name = name;
        this.price = price;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            players.add(new Player("player" + i, i * 570.0, 18 + i));
        }
        double totalPrice = 0;
        int totalAge = 0;
        for (Player player : players) {
            totalPrice += player.getPrice();
            totalAge += player.getAge();
        }
        double averagePrice = totalPrice / players.size();
        System.out.println(averagePrice);
        System.out.println(totalAge);
    }
}
