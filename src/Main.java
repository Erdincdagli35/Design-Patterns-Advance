public class Main {

    public static void main(String[] args) {
        System.out.println("Template Method");

        Pizza meatFeastPizza = new MeatFeastPizza();
        Pizza vegetarianPizza = new VegetarianPizza();

        meatFeastPizza.printInstructions();
        vegetarianPizza.printInstructions();

        Pirate pirate = new Pirate();
        pirate.defendAgainstToAttack();
    }
}