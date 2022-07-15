package variationjava;

public class RedCycleFactory implements CycleFactory {
    @Override
    public Bicycle createBicycle() {
        return new RedBicycle();
    }

    @Override
    public Tricycle createTricycle() {
        return new RedTricycle();
    }
}
