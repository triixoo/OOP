package Generic;
import java.util.ArrayList;
import java.util.List;

class StudentList<T extends Student> {
    private List<T> students = new ArrayList<>();

    // Constructors
    public StudentList() {
    }

    public StudentList(List<T> students) {
        this.students = students;
    }

    // Methods
    public void addStudent(T student) {
        students.add(student);
    }

    public void removeStudent(T student) {
        students.remove(student);
    }

    public T getHighestGpaStudent() {
        if (students.isEmpty()) {
            return null;
        }
        T highestGpaStudent = students.get(0);
        for (T student : students) {
            if (student.getGpa() > highestGpaStudent.getGpa()) {
                highestGpaStudent = student;
            }
        }
        return highestGpaStudent;
    }

    public List<T> getStudents() {
        return students;
    }

    public void swap(int index1, int index2) {
        if (index1 >= 0 && index1 < students.size() && index2 >= 0 && index2 < students.size()) {
            T temp = students.get(index1);
            students.set(index1, students.get(index2));
            students.set(index2, temp);
        } else {
            System.out.println("Invalid index");
        }
    }
}
