package Homework5;

public class Main {
    public static void main(String[] args) {
        Users[] usersArray = new Users[10];
        for (int i = 0; i < 10; i++) {
            usersArray[i] = new Users("John", "Smith");
        }

        UserBean UseBeanlmp = new UseBeanlmp(usersArray);

        UseBeanlmp.getAllUsers();
        UseBeanlmp.getUsersByName("John");
        UseBeanlmp.getUsersBySurname("Smith");
    }
}
