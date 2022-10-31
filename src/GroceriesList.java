import java.util.ArrayList;

public class GroceriesList implements Groceries{

    ArrayList<Groceries> groceries = new ArrayList<Groceries>();

    public GroceriesList(){
        Bread bread = new Bread();
        Milk milk =new Milk();
        Bread bread2 = new Bread();

        groceries.add(bread);
        groceries.add(milk);
        groceries.add(bread2);
    }

    public double getPrice(){
        return groceries.stream()
                        .mapToDouble(Groceries::getPrice)
                        .sum();
    }

    @Override
    public void accept(Visitor visitor) {
        groceries.forEach(g -> g.accept(visitor));
        visitor.visit(this);
    }
}
