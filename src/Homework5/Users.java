package Homework5;
public class Users {
    private String name;
    private String surname;

    public Users(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Users(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
