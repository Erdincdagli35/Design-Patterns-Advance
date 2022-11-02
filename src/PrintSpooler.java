public class PrintSpooler {

    final private static PrintSpooler printSpooler = new PrintSpooler();

    private static boolean initialized = false;

    private PrintSpooler() {
    }

    private void init() {
    }

    public static PrintSpooler getInstance() {
        if (initialized) return printSpooler;
        printSpooler.init();
        initialized = true;
        return printSpooler;
    }
}
