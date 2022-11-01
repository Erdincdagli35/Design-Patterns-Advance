import java.awt.*;

public class CarBuilder implements Builder{
    private Color color;
    private int doorNumber;
    private double maxSpeed;

    public CarBuilder() {
    }

    @Override
    public CarBuilder setCeilingHeight(int ceilingHeight) {
        return null;
    }

    @Override
    public CarBuilder setDimension(Dimension dimensions) {
        return null;
    }

    @Override
    public CarBuilder setFloorOfNumber(int floorNumber) {
        return null;
    }

    @Override
    public CarBuilder setWallColor(Color wallColor) {
        return null;
    }

    public CarBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public CarBuilder setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
        return this;
    }

    public CarBuilder setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public Car createCar(){
        return new Car(color,doorNumber,maxSpeed);
    }
}
