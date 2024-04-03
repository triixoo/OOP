package Homework2;

public class Toyota extends Car {
    String manufacturer;
    public Toyota() {
        super();
        this.manufacturer = "";
    }
    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume); // вызов констурктора супер класса
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Toyota(String manufacturer){
        this.manufacturer = manufacturer;
    }
    @Override
    public void ride(){
        System.out.println("Toyota is riding - " + maxSpeed + "km/h," + year + "year," + volume + "volume.");
    }
}



