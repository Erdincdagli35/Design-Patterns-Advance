import java.util.ArrayList;

public class HardCandy extends Candy{
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList<Candy> hardCandyPackage = new ArrayList<>();
        for (int i = 0; i < quantity; i++) hardCandyPackage.add(new HardCandy());
        System.out.println("One package of the " + quantity + " hard candy has been made!");
        return hardCandyPackage;
    }
}
