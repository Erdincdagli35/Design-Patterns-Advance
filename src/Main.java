public class Main {

    public static void main(String[] args) {
        System.out.println("Visitor Design Pattern");

        GroceriesList groceriesList = new GroceriesList();
        System.out.println("Total price of grocery list: "+ groceriesList.getPrice());

        groceriesList.accept(new DiscountVisitor());
        System.out.println("New total of the grocery list: "+groceriesList.getPrice());
    }
}
