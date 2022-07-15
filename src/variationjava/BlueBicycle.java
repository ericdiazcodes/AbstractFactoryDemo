package variationjava;

public class BlueBicycle implements Bicycle {
    @Override
    public Color color() {
        return Color.BLUE;
    }

    @Override
    public void ride() {
        System.out.println("Ridding my " + this.toString());
    }
}
