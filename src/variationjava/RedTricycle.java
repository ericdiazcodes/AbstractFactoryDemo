package variationjava;

public class RedTricycle implements Tricycle {
    @Override
    public Color color() {
        return Color.RED;
    }

    @Override
    public void ride() {
        System.out.println("Ridding my " + this.toString());
    }
}
