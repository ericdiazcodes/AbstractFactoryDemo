package variationjava;

abstract class Cycle {
    abstract int wheelCount();

    abstract Color color();

    void ride() {
        System.out.println("Ridding my " + this.toString() + " on " + wheelCount() + " wheels");
    }
}

