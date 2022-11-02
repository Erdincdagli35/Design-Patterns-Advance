import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public Main(){}

    public static void main(String[] args) {
        System.out.println("Singleton Design Pattern");

        PrintSpooler printSpooler = PrintSpooler.getInstance();

        Thread thread = new Thread(() -> {PrintSpooler s = PrintSpooler.getInstance();});
        Thread thread2 = new Thread(() -> {PrintSpooler s = PrintSpooler.getInstance();});

        thread.start();
        thread2.start();

    }
}
