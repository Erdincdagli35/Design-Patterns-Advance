import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Design Pattern");

        CandyFactory candyFactory = new CandyFactory();
        candyFactory.getCandyPackage(5,"hard candy");

    }
}
