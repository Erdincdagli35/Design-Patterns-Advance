package button;

public class SaveCommand implements ButtonCommand {
    final private Document document;

    public SaveCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.save();
    }
}
