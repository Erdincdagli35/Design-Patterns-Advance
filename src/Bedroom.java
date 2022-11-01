import java.awt.*;

public class Bedroom{

    private Dimension dimension;
    private int ceilingHeight;
    private int floorOfNumber;
    private Color wallColor;

    public Bedroom(Dimension dimension, int ceilingHeight, int floorOfNumber, Color wallColor) {
        this.dimension = dimension;
        this.ceilingHeight = ceilingHeight;
        this.floorOfNumber = floorOfNumber;
        this.wallColor = wallColor;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "dimension=" + dimension +
                ", ceilingHeight=" + ceilingHeight +
                ", floorOfNumber=" + floorOfNumber +
                ", wallColor=" + wallColor +
                '}';
    }
}
