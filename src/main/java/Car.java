public abstract class Car {

    private double speed;
    private String name;
    private String color;

    public Car(){}

    public Car(double speed,String name,String color){
        this.speed = speed;
        this.name = name;
        this.color = color;
    }

    public abstract String run(int speed);

    public String drive(int speed){
        this.speed = speed;
        return String.format(" drive %s with %s\n",this.name,speed);
    }

    public String acceleRate(){
        this.speed += 30;
        return String.format(" accele rate to %s with 30km\n", this.speed);
    }
    public String acceleRate(int speed){
        this.speed += speed;
        return String.format(" accele rate to %s with %skm\n", this.speed, speed);
    }

    public String slowDown(){
        this.speed -= 50;
        return String.format(" accele rate to %s with 50km\n", this.speed);
    }

    public String slowDown(int speed){
        this.speed -= speed;
        return String.format(" accele rate to %s with %skm\n", this.speed, speed);
    }

    public void stop(){
        this.speed = 0;
        System.out.println(this.name + " stop and slow down to 0 ");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

