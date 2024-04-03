package Homework2;

public class Car {
    String name;
    String model;
    int maxSpeed;
    int year;
    double volume;

    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public Car() {
        maxSpeed = 0;
        year = 0;
        volume = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void ride() {
        System.out.println("Car is riding - " + maxSpeed + "km/h," + year + "year," + volume + "volume.");
    }

        public static void main(String[] args) {
            Car car1 = new Car("carf", "model1", 220, 2024, 2.5);
            Car car2 = new Car("cars", "model2", 190, 2010, 2.0);
            Car car3 = new Car("cart", "model3", 183, 1998, 1.8);
            Toyota toyota1 = new Toyota("toyotaf", "Corolla", 150, 2019, 1.6, "Japan");
            Toyota toyota2 = new Toyota("toyotas", "Camry", 222, 2004, 2.0, "Kazakhstan");
            Toyota toyota3 = new Toyota("toyotat", "RAV4", 230, 2017, 2.5, "Russia");
            Mercedes mercedes1 = new Mercedes("mercedesf", "S223", 333, 2023, 2.0, "S Class");
            Mercedes mercedes2 = new Mercedes("mercedess", "Kaban", 250, 2002, 3.0, "S Class");
            Mercedes mercedes3 = new Mercedes("mercedest", "Luparik", 453, 1999, 2.2, "E Class");

            Car[] cars = {car1, car2, car3, toyota1, toyota2, toyota3, mercedes1, mercedes2, mercedes3};

            for (Car car : cars) {
                car.ride();
            }
        }
    }
