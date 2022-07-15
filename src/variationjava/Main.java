package variationjava;

public class Main {

    public static void main(String[] args) {
        var redCycleFactory = new RedCycleFactory();
        var blueCycleFactory = new BlueCycleFactory();

        var redBicycle = redCycleFactory.createBicycle();
        var blueTricycle = blueCycleFactory.createTricycle();

        redBicycle.ride();
        blueTricycle.ride();
    }

}
