public class RaceCar extends Car {

    public RaceCar(double speed, String name, String color) {
        super(speed, name, color);
    }

    public String Drift(){
        setSpeed(getSpeed() - 30);
        return String.format(" drift and accele rate to %s with 30km\n", getSpeed());
    }

    @Override
    public String run(int speed) {
        String runProcess = "";
        for(int i = 0 ; i < 5 ; i++){
            runProcess += super.acceleRate(speed);
        }
        return runProcess + Drift() + Drift();
    }
}
