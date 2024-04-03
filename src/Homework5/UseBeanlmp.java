package Homework5;

public class UseBeanlmp implements UserBean{
    private Users[] users;

    public UseBeanlmp(Users[] users) {
        this.users = users;
    }

    @Override
    public void getAllUsers() {
        System.out.println("All userws");
        for (Users user : users){
            System.out.println("Name" + user.getName() + "Surname" + user.getSurname());
        }
    }

    @Override
    public void getUsersByName(String name) {
        System.out.println("Users with name" + name );
        for (Users user : users){
            if(user.getName().equals(name)){
                System.out.println("NAme: " + user.getName() + " SUrname:" +  user.getSurname());
            }
        }
        System.out.println();
    }

    @Override
    public void getUsersBySurname(String surname) {
        System.out.println("Users with surname " + surname );
        for (Users user : users) {
            if (user.getSurname().equals(surname)) {
                System.out.println("Name: " + user.getName() + ", Surname: " + user.getSurname());
            }
        }
        System.out.println();
    }
}
