package Homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<User> users = new ArrayList<>();

    public void displayMenu() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO ADD STUDENT");
            System.out.println("PRESS [3] TO ADD STAFF");
            System.out.println("PRESS [4] TO LIST USERS");
            System.out.println("PRESS [5] TO LIST STUDENTS");
            System.out.println("PRESS [6] TO LIST STAFF");
            System.out.println("PRESS [0] TO EXIT");
            System.out.print("vash vybor: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    addUser(in);
                    break;
                case 2:
                    addStudent(in);
                    break;
                case 3:
                    addStaff(in);
                    break;
                case 4:
                    listUsers();
                    break;
                case 5:
                    listStudents();
                    break;
                case 6:
                    listStaff();
                    break;
                case 0:
                    System.out.println("Sau-bol");
                    return;
                default:
                    System.out.println("Ne pravilno vyushlo");
            }
        }
    }

    private void addUser(Scanner in) {
        System.out.print("Enter user ID: ");
        int id = in.nextInt();
        in.nextLine(); // Consume newline
        System.out.print("Enter user login: ");
        String login = in.nextLine();
        System.out.print("Enter user password: ");
        String password = in.nextLine();
        System.out.print("Enter user name: ");
        String name = in.nextLine();
        System.out.print("Enter user surname: ");
        String surname = in.nextLine();
        users.add(new User(id, login, password, name, surname));
        System.out.println("User added successfully.");
    }

    private void addStudent(Scanner in) {
        System.out.print("Enter student ID: ");
        int id = in.nextInt();
        System.out.print("Enter student login: ");
        String login = in.nextLine();
        System.out.print("Enter student password: ");
        String password = in.nextLine();
        System.out.print("Enter student name: ");
        String name = in.nextLine();
        System.out.print("Enter student surname: ");
        String surname = in.nextLine();
        System.out.print("Enter student GPA: ");
        double gpa = in.nextDouble();
        users.add(new Student(id, login, password, name, surname, gpa));
        System.out.println("Student added successfully.");
    }

    private void addStaff(Scanner in) {
        System.out.print("Enter staff ID: ");
        int id = in.nextInt();
        System.out.print("Enter staff login: ");
        String login = in.nextLine();
        System.out.print("Enter staff password: ");
        String password = in.nextLine();
        System.out.print("Enter staff name: ");
        String name = in.nextLine();
        System.out.print("Enter staff surname: ");
        String surname = in.nextLine();
        System.out.print("Enter staff salary: ");
        double salary = in.nextDouble();
        users.add(new Staff(id, login, password, name, surname, salary));
        System.out.println("Staff added successfully.");
    }

    private void listUsers() {
        System.out.println("Listing all users:");
        for (User user : users) {   // iteration
            System.out.println(user);
        }
    }

    private void listStudents() {
        System.out.println("Listing all students:");
        for (User user : users) {
            if (user instanceof Student) {  // prinadlezhit li object tipu
                System.out.println(user);
            }
        }
    }

    private void listStaff() {
        System.out.println("Listing all staff:");
        for (User user : users) {
            if (user instanceof Staff) {
                System.out.println(user);
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu();
    }
}
