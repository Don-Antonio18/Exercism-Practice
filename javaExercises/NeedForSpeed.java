class NeedForSpeed {

    final int speed;
    final int batteryDrain;
    int mileage;
    int batteryPercentage;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.mileage = 0;
        this.batteryPercentage = 100;
    }

    public boolean batteryDrained() {
        return (this.batteryPercentage < this.batteryDrain);
    }

    public int distanceDriven() {
        return this.mileage;
    }

    public void drive() {
        if (!this.batteryDrained()) {
            this.mileage += this.speed;
            this.batteryPercentage -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    final int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int laps = (this.distance + car.speed - 1) / car.speed ;
        int totalDrain = laps * car.batteryDrain;
        return totalDrain <= car.batteryPercentage;
    }
}


