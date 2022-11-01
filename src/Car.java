import java.awt.*;

public class Car {
    private Color color;
    private int doorNumber;
    private double maxSpeed;

    public Car(Color color, int doorNumber, double maxSpeed) {
        this.color = color;
        this.doorNumber = doorNumber;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", doorNumber=" + doorNumber +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
