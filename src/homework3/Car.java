public class Car {
    private String name;
    private boolean engineRunning;
    private int speed;

    public Car(String name) {
        this.name = name;
        this.speed = 0;
        this.engineRunning = false;
    }

    public void getName() {
        System.out.println(this.name + "\n");
    }

    public void startEngine() {
        if (!engineRunning) {
            this.engineRunning = true;
            System.out.println("Engine started");
        } else {
            System.out.println("Engine already started");
        }
    }

    public void stopEngine() {
        if (engineRunning) {
            this.engineRunning = false;
            System.out.println("Engine stopped");
        } else {
            System.out.println("Engine already stopped");
        }
    }


    public void increaseSpeed(int speed) {
        if (engineRunning) {
            if (speed < 0) {
                System.out.println("Invalid data");
                return;
            }
            this.speed += speed;
            System.out.println("Current speed" + this.speed);
        } else {
            System.out.println("Engine is stopped and we can't increase the  speed");
        }
    }

    public void decreaseSpeed(int speed) {
        if (engineRunning) {
            if (speed < 0) {
                System.out.println("Invalid data");
                return;
            }
            int speedResult = this.speed - speed;
            if (speedResult < 0) {
                System.out.println("Invalid data");
                return;
            }
            this.speed = speedResult;
            System.out.println("Current speed" + this.speed);
        }


    }

    public static void main(String[] args) {
        Car car = new Car("BMW");
        car.getName(); // BMW

        car.startEngine(); // Engine started
        car.startEngine(); // Engine already started

        car.increaseSpeed(15); // Current speed 15
        car.increaseSpeed(20); // Current speed 35

        car.decreaseSpeed(10); // Current speed 25

        car.stopEngine(); // Engine stopped
        car.stopEngine(); // Engine already stopped

        car.increaseSpeed(1); // Engine is stopped and we cant increase the speed
    }
    }
