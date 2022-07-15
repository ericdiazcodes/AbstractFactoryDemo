package variationjava;

public class BlueTricycle implements Tricycle {
    @Override
    public Color color() {
        return Color.BLUE;
    }

    @Override
    public void ride() {
        System.out.println("Ridding my " + this.toString());
    }
}
