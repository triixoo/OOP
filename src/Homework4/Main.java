package Homework4;

public abstract class Main {
    public static void main(String[] args) {
        Chocolate snickers = new Chocolate("snickers", 100);
        Chocolate twix = new Chocolate("twix", 140);
        Burger burger = new Burger("Burger King ", 300);
        Burger burger1 = new Burger("McDonalds", 400);
        Coke coke = new Coke("Coca Cola ", 2, true);
        Coke coke1 = new Coke("Fuse Tea", 1.5, false);
        Food[] foods = new Food[]{snickers, twix, burger, burger1, coke, coke1};

            double maxCalories = 0;
            String mamaxCaloriesFood = "";

            for (int i = 0; i < foods.length; i++) {
                Food food = foods[i];
                System.out.println(food);

                if (food.getCalories() > maxCalories) {
                    maxCalories = food.getCalories();
                    mamaxCaloriesFood = food.getName();
                }
            }

            System.out.println('\n' + "Max colorias food " + mamaxCaloriesFood + " " + maxCalories);
        }
    }

