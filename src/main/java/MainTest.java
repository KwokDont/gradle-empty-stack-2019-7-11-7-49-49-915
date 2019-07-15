public class MainTest {
    public static void main(String[] args) {
        Driver jimmy = new Driver(70,12,70,"Jimmy");
        Android Mi9 = new Android("XiaoMi","XiaoMi9");
        IOS iphone = new IOS("iphone","IPhone XSM");
        jimmy.buyPhone(Mi9);
        jimmy.buyPhone(iphone);
        Jeep jeep = new Jeep(70,"jeep","yellow");
        jimmy.setCar(jeep);
        jimmy.phoneCall("13192286954");
        jimmy.sendMessage("I buy a new car");
        RaceCar race = new RaceCar(100,"lambo","yellow");
        jimmy.setCar(race);
        jimmy.runCar(20);
        jimmy.stop();

        System.out.println("-----------------------");


    }
}
