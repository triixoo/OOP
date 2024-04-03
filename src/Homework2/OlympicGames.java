package Homework2;

public class OlympicGames {
    String city;
    int year;
    Gymnast gymnast;
    Footballer footballer;
    Swimmer swimmer;
    public OlympicGames(){

    }
    public OlympicGames(String city, int year, Gymnast gymnast, Footballer footballer, Swimmer swimmer) {
        this.city = city;
        this.year = year;
        this.gymnast = gymnast;
        this.footballer = footballer;
        this.swimmer = swimmer;
    }
    public void showAllData() {
        System.out.println("Gymnast:");
        gymnast.play();
        System.out.println("Footballer:");
        footballer.play();
        System.out.println("Swimmer:");
        swimmer.play();
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Gymnast getGymnast() {
        return gymnast;
    }

    public void setGymnast(Gymnast gymnast) {
        this.gymnast = gymnast;
    }

    public Footballer getFootballer() {
        return footballer;
    }

    public void setFootballer(Footballer footballer) {
        this.footballer = footballer;
    }

    public Swimmer getSwimmer() {
        return swimmer;
    }

    public void setSwimmer(Swimmer swimmer) {
        this.swimmer = swimmer;
    }
}
