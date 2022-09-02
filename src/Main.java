public class Main {

    public static void main(String[] args) {
        System.out.println("Mediator \n\n");

        /*
        Customer customer = new Driver.Customer("123 Sunny Street");
        customer.buy("pens",3);
         */

        System.out.println("Driver Example: \n");
        Driver.Mediator driverMediator = new Driver.Mediator();
        driverMediator.buy("pens",3);

        System.out.println("Plane Example: \n");
        Plane.Mediator planeMediator = new Plane.Mediator();
        planeMediator.takeOff();

    }
}
