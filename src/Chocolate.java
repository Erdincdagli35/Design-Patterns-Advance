import java.util.ArrayList;

public class Chocolate extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList<Candy> chocolatePackage = new ArrayList<>();
        for (int i = 0; i < quantity; i++) chocolatePackage.add(new Chocolate());
        System.out.println("One package of the " + quantity + " chocolates has been made!");
        return chocolatePackage;
    }
}
