package task3;

public class Phone {
    private long number;
    private String model;
    private double weight;

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling.");
    }

    public void receiveCall(String name, long number) {
        System.out.println(name + " is calling. Number: " + getNumber());
    }

    public void sendMessage(long... numbers) {
        System.out.println("Numbers: ");
        for (long num : numbers) {
            System.out.println(num);
        }
    }
}
