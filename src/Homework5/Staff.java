package Homework5;

public class Staff implements Workers {
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Staff(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return "ID: " + id + ", Name: " + name + ", Surname: " + surname + ", Salary: " + salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}


