import java.util.ArrayList;
import java.util.List;

public class Secretary extends Person implements CallApi {

    private List<Phone> phones = new ArrayList<Phone>();

    public Secretary(double weight, int age, int heartRate, String name) {
        super(weight, age, heartRate, name);
    }

    @Override
    public void phoneCall(String phoneNum) {
        StringBuilder phoneCallString = new StringBuilder(getName());
        for(Phone phone:phones){
            phoneCallString.append(" use " + phone.getPhoneName() + phone.takePhoneCall(phoneNum) + "\n");
        }
        System.out.println(phoneCallString.toString());
    }
}
