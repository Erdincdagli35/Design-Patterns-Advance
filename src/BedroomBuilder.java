import java.awt.*;

public class BedroomBuilder implements Builder {
    private Dimension dimension;
    private int ceilingHeight;
    private int floorOfNumber;
    private Color wallColor;

    public BedroomBuilder(){}

    public Dimension getDimension() {
        return dimension;
    }
    @Override
    public BedroomBuilder setDimension(Dimension dimension) {
        this.dimension = dimension;
        return this;
    }

    public int getCeilingHeight() {
        return ceilingHeight;
    }

    @Override
    public BedroomBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    public int getFloorOfNumber() {
        return floorOfNumber;
    }

    @Override
    public BedroomBuilder setFloorOfNumber(int floorOfNumber) {
        this.floorOfNumber = floorOfNumber;
        return this;
    }

    public Color getWallColor() {
        return wallColor;
    }

    @Override
    public BedroomBuilder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    @Override
    public Builder setColor(Color color) {
        return null;
    }

    @Override
    public Builder setDoorNumber(int doorNumber) {
        return null;
    }

    @Override
    public Builder setMaxSpeed(double maxSpeed) {
        return null;
    }

    public Bedroom createBedroom(){
        return new Bedroom(dimension,ceilingHeight,floorOfNumber,wallColor);
    }
}
