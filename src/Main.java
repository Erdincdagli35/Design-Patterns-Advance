import text.TextDocument;

public class Main {

    final private static TextDocument textDocument = new TextDocument();
    final private static Adder adder = new Adder();

    public static void main(String[] args) {
        System.out.println("text.Memento \n\n");

        textDocument.write("Hello");
        textDocument.save();
        textDocument.print();

        textDocument.write(" World");
        textDocument.print();
        textDocument.undo();
        textDocument.print();

        textDocument.write(" Erdinç");
        textDocument.print();
        textDocument.save();

        textDocument.write(" Dağlı");
        textDocument.print();
        textDocument.undo();
        textDocument.print();

        System.out.println("text.Adder \n\n");

        adder.save();
        adder.add(10);
        System.out.println(adder.getResult());

        adder.undo();
        System.out.println(adder.getResult());
    }
}
