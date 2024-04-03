package Middtern;

public class Woman {
        private String name;
        private String surname;
        private int age;
        public Woman(){
        }
        public Woman(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
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

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Man{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age +
                    '}';
        }
        public static void main(String[] args) {
            Woman woman1 = new Woman("Kenny", "Mills", 17);
            Woman woman2 = new Woman("Alice", "Smith", 16);
            Woman woman3 = new Woman("Ayhanym", "Batyrbek", 18);

            System.out.println(woman1);
            System.out.println(woman2);
            System.out.println(woman3);
        }
    }



