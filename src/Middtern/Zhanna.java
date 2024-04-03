package Middtern;

class Zhanna extends Person {
    private String hobby;

    public Zhanna(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    @Override
    public void sleep() {
        System.out.println("Zhanna is sleeping.");
    }

    @Override
    public void run() {
        System.out.println("Zhanna is running.");
    }

    @Override
    public String toString() {
        return "Zhanna{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}

class Adlet extends Person {
    private int experienceYears;

    public Adlet(String name, int age, int experienceYears) {
        super(name, age);
        this.experienceYears = experienceYears;
    }

    @Override
    public void sleep() {
        System.out.println("Adlet is sleeping.");
    }

    @Override
    public void run() {
        System.out.println("Adlet is running.");
    }

    @Override
    public String toString() {
        return "Adlet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experienceYears=" + experienceYears +
                '}';
    }
}

class Aset extends Person {
    private boolean canSong;

    public Aset(String name, int age, boolean canSong) {
        super(name, age);
        this.canSong = canSong;
    }

    @Override
    public void sleep() {
        System.out.println("Aset is sleeping.");
    }

    @Override
    public void run() {
        System.out.println("Aset is running.");
    }

    @Override
    public String toString() {
        return "Aset{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasPets=" + canSong +
                '}';
    }

    public static void main(String[] args) {
        Zhanna zhanna1 = new Zhanna("Zhanna", 28, "Painting");
        Zhanna zhanna2 = new Zhanna("Lena", 30, "Joking");
        Adlet adlet1 = new Adlet("Adlet", 50, 23);
        Adlet adlet2 = new Adlet("Bekzat", 21, 3);
        Aset aset1 = new Aset("Aset", 22, true);
        Aset aset2 = new Aset("Dana", 24, false);
        Person[] people = {zhanna1, zhanna2, adlet1, adlet2, aset1, aset2};
        for (Person person : people) {
            if (person instanceof Adlet || person instanceof Aset) {
                System.out.println(person);
            }
        }
    }
}

