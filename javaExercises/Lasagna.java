public class Lasagna {


    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        // Each layer takes 2 minutes to cook
        return 2 * layers;
    }

    public int totalTimeInMinutes(int layers, int numMinutesInOven) {
        return preparationTimeInMinutes(layers) + numMinutesInOven;
    }
    
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        int output = lasagna.preparationTimeInMinutes(30);
        System.out.println(output);
    }
}