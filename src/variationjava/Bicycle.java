package variationjava;

abstract class Bicycle implements Cycle {
    @Override
    public void ride() {
        System.out.println("Ridding my " + this.toString());
    }
}
