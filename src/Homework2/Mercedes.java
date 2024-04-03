package Homework2;

public class Mercedes extends Car{
    String classType;
    public Mercedes(){
        super();
        this.classType ="";
    }

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Mercedes(String classType) {
        this.classType = classType;
    }
    @Override
    public void ride() {
        System.out.println("Mercedes is riding - " + maxSpeed + "km/h," + year + "year," + volume + "volume.");
    }
}
