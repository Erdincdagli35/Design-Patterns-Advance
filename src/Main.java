public class Main {

    public static void createBikeWithoutAbstractFactory() {
        MountainBikeTire mountainBikeTireFront = new MountainBikeTire();
        MountainBikeTire mountainBikeTireBack = new MountainBikeTire();

        MountainBikeHandleBar mountainBikeHandleBar = new MountainBikeHandleBar();
        mountainBikeTireFront.getDescription();
        mountainBikeTireBack.getDescription();
        mountainBikeHandleBar.getDescription();
        System.out.println();
    }

    public static void createBikeWithAbstractFactory(String type) {
        BikeFactory factory = FactoryCreator.createFactory(type);
        Tire tireFront = factory.createTire();
        Tire tireBack = factory.createTire();
        HandleBar handleBar = factory.createHandleBar();
        tireFront.getDescription();
        tireBack.getDescription();
        handleBar.getDescription();
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Abstract-Factory Design Pattern");

        createBikeWithoutAbstractFactory();
        createBikeWithAbstractFactory("mountain bike");
        createBikeWithAbstractFactory("road bike");
    }
}
