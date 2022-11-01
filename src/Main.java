import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Builder Design Pattern");

        Bedroom room = new BedroomBuilder()
                .setDimension(new Dimension(123, 123))
                .setCeilingHeight(132)
                .setFloorOfNumber(2)
                .setWallColor(Color.BLUE)
                .createBedroom();

        Car car = new CarBuilder()
                .setColor(Color.BLUE)
                .setDoorNumber(4)
                .setMaxSpeed(350)
                .createCar();

        System.out.println("Room : "+room.toString() + "\nCar : " + car.toString());
    }
}
