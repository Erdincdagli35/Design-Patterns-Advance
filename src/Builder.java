import java.awt.*;

public interface Builder {
    Builder setCeilingHeight(int ceilingHeight);
    Builder setDimension(Dimension dimensions);
    Builder setFloorOfNumber(int floorNumber);
    Builder setWallColor(Color wallColor);

    Builder setColor(Color color);

    Builder setDoorNumber(int doorNumber);

    Builder setMaxSpeed(double maxSpeed);
}
