package Homework2;

public class Main {
    public static void main(String[] args) {
        Gymnast gymnast = new Gymnast("Timur Yesmagaliev", 33, "Kazakhstan", 170, 70, "endurance");
        Swimmer swimmer = new Swimmer("Dmitry Bolandyn", 28, "Kazakhstan", "brass", 1.17);
        Footballer footballer = new Footballer("Leo Messi", 36, "Argentina", "forward", "Inter Miami");
        OlympicGames olympicGames = new OlympicGames("Parij", 2024, gymnast, footballer, swimmer);
        olympicGames.showAllData();
    }
}
