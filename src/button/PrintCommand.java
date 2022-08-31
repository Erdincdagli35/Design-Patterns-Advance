package button;

public class PrintCommand implements ButtonCommand {
    final private Document document;

    public PrintCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.print();
    }
}
