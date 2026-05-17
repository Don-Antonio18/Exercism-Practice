package RemoteControl;

public class ExperimentalRemoteControlCar implements RemoteControlCar {

    final int speed;
    int distanceTravelled;

    public ExperimentalRemoteControlCar() {
        this.speed = 20;
        this.distanceTravelled = 0;
    }

    @Override
    public void drive() {
        this.distanceTravelled += this.speed;
    }

    @Override
    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }
}
