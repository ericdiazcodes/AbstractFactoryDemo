package variationjava;

public class BlueCycleFactory implements CycleFactory {
    @Override
    public Bicycle createBicycle() {
        return new BlueBicycle();
    }

    @Override
    public Tricycle createTricycle() {
        return new BlueTricycle();
    }
}
