import java.util.ArrayList;
import java.util.List;

public class Driver extends Person implements CallApi {

    private List<Phone> phones = new ArrayList<Phone>();
    private Car car;

    public Driver(double weight, int age, int heartRate, String name) {
        super(weight, age, heartRate, name);
    }

    @Override
    public void phoneCall(String phoneNum){
        StringBuilder phoneCallString = new StringBuilder(getName());
        for(Phone phone:phones){
            phoneCallString.append(" use " + phone.getPhoneName() + phone.takePhoneCall(phoneNum) + "\n");
        }
        System.out.println(phoneCallString.toString());
    }

    public void sendMessage(String content){
        StringBuilder messageString = new StringBuilder(getName());
        for(Phone phone:phones){
            messageString.append(" use " + phone.getPhoneName() + phone.sendMessage(content) + "\n");
        }
        System.out.println(messageString.toString());
    }

    public void drive(){
        System.out.println(car.getName() + car.drive(100));
    }

    public void buyPhone(Phone phone){
        phones.add(phone);
        System.out.println(String.format(getName() + "buy a new phone %s",phone.getPhoneName()));
    }

    public void stop(){
        this.car.setSpeed(0);
        System.out.println(getName() + " stop the " + car.getName());
    }

    public void runCar(int speed){
        this.car.run(speed);
    }

    public Driver(String name) {
        super(name);
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
