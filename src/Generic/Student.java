package Generic;
public class Student {
    private String firstName;
    private String lastName;
    private int studentId;
    private double gpa;
    public Student() {
    }

    public Student(String firstName, String lastName, int studentId, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId=" + studentId +
                ", gpa=" + gpa +
                '}';
    }
}

