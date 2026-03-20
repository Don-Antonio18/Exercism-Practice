public class JedliksToyCar {
    private boolean batteryIsEmpty = false;
    public final int fuelCost = 20;
    public final int batteryCost = 1;
    private int mileage;
    private int battery = 100;
    public String emptyMessage = "Battery empty";


    public int getMileage() {
        return this.mileage;
    }

    public int getBattery() {
        return this.battery;
    }

    // Return a brand-new remote controlled car instance
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    // Return the distance as displayed on the LED display:
    public String distanceDisplay() {
        return ("Driven " + this.getMileage() + " meters") ;
    }

    // Return the battery percentage as displayed on the LED display:
    public String batteryDisplay() {
        if (this.batteryIsEmpty) {
            return this.displayEmptyMessage();
        }
        else {
            return "Battery at " + this.getBattery() + "%";
        }
    }

    public String displayEmptyMessage() {
        return "Battery empty";
    }

    // Updates the number of meters driven:
    // Dot increase the distance driven nor decrease the battery percentage when the battery is drained (at 0%)
    public void drive() {

        if (this.battery == 0) {
            this.batteryIsEmpty = true;
            this.battery -= 0;
            this.mileage += 0;

        } else {
            this.battery -= 1;
            this.mileage += 20;
        }
    }


    public static void main(String[] args) {
        JedliksToyCar car = new JedliksToyCar();
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }
}
