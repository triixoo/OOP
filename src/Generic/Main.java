package Generic;
public class Main {
    public static void main(String[] args) {
        StudentList<Student> studentList = new StudentList<>();
        studentList.addStudent(new Student("Айдос", "Жумабаев", 1, 3.8));
        studentList.addStudent(new Student("Айгерим", "Темиргалиева", 2, 3.9));
        studentList.addStudent(new Student("Айбек", "Серикбаев", 3, 3.5));
        for (Student student : studentList.getStudents()) {
            System.out.println(student);
        }
        Student highestGpaStudent = studentList.getHighestGpaStudent();
        System.out.println("Студент с наивысшим GPA: " + highestGpaStudent);
        studentList.swap(0, 2);
        System.out.println("Обновленный список студентов:");
        for (Student student : studentList.getStudents()) {
            System.out.println(student);
        }
    }
}
