package Homework5;

public class HRManagers implements Workers {
    private int id;
    private String fullName;
    private int salary;

    public HRManagers(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return "ID: " + id + ", Full Name: " + fullName + ", Salary: " + salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
