import java.util.List;

public class Person {

    private double weight;
    private int age;
    private int heartRate;
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(double weight, int age, int heartRate, String name) {
        this.weight = weight;
        this.age = age;
        this.heartRate = heartRate;
        this.name = name;
    }

    public void eat(String food){
        this.weight += 1;
        System.out.println("Gain one kilogram");
    }

    public void introduce(String content){
        this.heartRate += 30;
        System.out.println("Heart rate increased by 30");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
