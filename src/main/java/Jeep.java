public class Jeep extends Car {

    public Jeep(double speed, String name, String color) {
        super(speed, name, color);
    }

    public String Jump(){
        setSpeed(getSpeed() - 10);
        return String.format(" accele rate to %s with 10km\n", getSpeed());
    }

    @Override
    public String run(int speed) {
        return super.acceleRate(speed) + super.acceleRate(speed) + Jump();
    }
}
