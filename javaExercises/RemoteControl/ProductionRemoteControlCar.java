package RemoteControl;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    final int speed;
    int distanceTravelled;
    int numVictories;

    public ProductionRemoteControlCar(){
        this.speed = 10;
        this.distanceTravelled = 0;
        this.numVictories = 0;
    }

    @Override
    public void drive() {
        this.distanceTravelled += this.speed;
    }

    @Override
    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar car) {
        // sort in descending order
        return car.numVictories - this.numVictories;
    }

    public int getNumberOfVictories() {
        return this.numVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numVictories = numberOfVictories;
    }
}
