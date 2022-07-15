package variationjava;

abstract class Tricycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Ridding my " + this.toString());
    }
}
