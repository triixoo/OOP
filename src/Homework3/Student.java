package Homework3;

import java.util.Arrays;

class Student extends User {
    private double gpa;
    private final String[] courses = new String[100];
    private int indexOfCourses = 0;

    public Student() {}

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void addCourse(String course) {
        courses[indexOfCourses++] = course;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", courses=" + Arrays.toString(courses) +
                ", indexOfCourses=" + indexOfCourses +
                "} " + super.toString();
    }
}
