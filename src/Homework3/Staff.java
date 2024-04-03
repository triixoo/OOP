package Homework3;

import java.util.Arrays;

class Staff extends User {
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff() {}

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addSubject(String subject) {
        subjects[indexOfSubject++] = subject;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salary=" + salary +
                ", subjects=" + Arrays.toString(subjects) +
                ", indexOfSubject=" + indexOfSubject +
                "} " + super.toString();
    }
}