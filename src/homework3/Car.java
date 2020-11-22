package homework3;
//Task3
public class Car {
    private String name;
    private boolean start;
    private int gear;
    private int speed;

    public Car (String Name , boolean isStart , int Gear , int speed){
        this.name=Name;
        this.start=isStart;
        this.gear=Gear;
        this.speed=speed;
    }

    public void name(){
        System.out.println("\n"+name);
    }

    public void status() {
        if (start = true) {
            System.out.println("The car is started");
        }
        else {
            System.out.println("Engine is off.");
        }
    }

    public void Gear() {
        this.gear = gear;
        if (gear == 0) {
            System.out.println("Please turn on first gear ");
            return;
        }
        System.out.println("Car gear is " + gear);
    }

    public void speed() {
        this.speed = speed;
        if (speed > 0) {
            System.out.println("The car speed is " + speed + " km per hour");
        } else if (speed > 150) {
            System.out.println("Please reduce speed");
        } else {
            System.out.println("Please start because your speed is "+speed);
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Ferari",true,0,0);
        car1.name();
        car1.status();
        car1.Gear();
        car1.speed();

        Car car2 = new Car("BMW",true, 5,180);
        car2.name();
        car2.status();
        car2.Gear();
        car2.speed();
    }
}
