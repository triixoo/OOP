package Homework5;

public class Programmers implements Workers {
    private int id;
    private String nickname;
    private int salary;
    private int bonusSalary;
    private double KPIValue;

    public Programmers(int id, String nickname, int salary, int bonusSalary, double KPIValue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    @Override
    public String getWorkerData() {
        return "ID: " + id + ", Nickname: " + nickname + ", Salary: " + getSalary();
    }

    @Override
    public int getSalary() {
        return (int) (salary + KPIValue * bonusSalary);
    }
}
