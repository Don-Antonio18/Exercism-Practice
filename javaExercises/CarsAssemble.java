public class CarsAssemble {
    public double successRate;
    int baseCarsPerHour = 221;

    public double calculateSuccessRate(int speed) {
        if (speed < 1 || speed > 10) {
            return 0;
        }
        if (speed >= 1 && speed <= 4) {
            successRate = 1.0;
        }
        if (speed >= 5 && speed <= 8) {
            successRate = 0.90;
        }
        if (speed == 9) {
            successRate = 0.80;
        }
        if (speed == 10) {
            successRate = 0.77;
        }

        return successRate;
    }
    public double productionRatePerHour(int speed) {
        calculateSuccessRate(speed);
        return (double)(baseCarsPerHour * speed * successRate);
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);
    }
}
