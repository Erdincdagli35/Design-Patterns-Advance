public class VegetarianPizza extends Pizza{
    public void addToppings(){
        super.addToppings();
        System.out.println("Add peppers");
        System.out.println("Add olives");
    }

    public void cook(){
        System.out.println("Cook in the oven 20 minutes");
    }
}
