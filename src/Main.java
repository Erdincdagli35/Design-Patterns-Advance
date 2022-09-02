import button.*;
import jacket.*;
import water.*;
public class Main {

    final private static Document document = new Document();
    final private static Jacket jacket = new Jacket();
    final private static Water water = new Water();

    public static void main(String[] args) {
        System.out.println("Command\n\n");

        System.out.println("Button Example : ");
        Button saveButton = new Button("Save");
        Button printButton = new Button("Print");

        saveButton.click(new SaveCommand(document));
        printButton.click(new PrintCommand(document));

        System.out.println("\nJacket Example : ");
        OrderHandler placeOrderHandler = new OrderHandler();
        OrderHandler returnOrderHandler = new OrderHandler();

        placeOrderHandler.invoke(new PlaceOrderCommand(jacket));
        returnOrderHandler.invoke(new ReturnOrderCommand(jacket));

        System.out.println("\nWater Example : ");
        PourWater hotPourWater = new PourWater("Hot");
        PourWater coldPourWater = new PourWater("Cold");

        hotPourWater.click(new HotWaterCommand(water));
        coldPourWater.click(new ColdWaterCommand(water));
    }
}
