package Practice;
public class Phone {
    private String number;
    private String model;
    private double weight;
    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {
    }
    public String getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public double getWeight() {
        return weight;
    }
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + ". Номер телефона: " + callerNumber);
    }
    public static void sendMessage(String... phoneNumbers) {
        System.out.println("Отправка сообщения на следующие номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "Samsung Galaxy", 0.2);
        Phone phone2 = new Phone("987654321", "iPhone 15 Pro");
        Phone phone3 = new Phone();
        System.out.println("Phone 1: Number - " + phone1.getNumber() + ", Model - " + phone1.getModel() + ", Weight - " + phone1.getWeight());
        System.out.println("Phone 2: Number - " + phone2.getNumber() + ", Model - " + phone2.getModel() + ", Weight - " + phone2.getWeight());
        System.out.println("Phone 3: Number - " + phone3.getNumber() + ", Model - " + phone3.getModel() + ", Weight - " + phone3.getWeight());
        phone1.receiveCall("Johny");
        phone2.receiveCall("Sins");
        phone3.receiveCall("Sally");
        phone1.receiveCall("Emma", "987654321");
        sendMessage("111222333", "444555666", "777888999");
    }
}

