package variationjava;

public class RedBicycle implements Bicycle {
    @Override
    public Color color() {
        return Color.RED;
    }

    @Override
    public void ride() {
        System.out.println("Ridding my " + this.toString());
    }
}
