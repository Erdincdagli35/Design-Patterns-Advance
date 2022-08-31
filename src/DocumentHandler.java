public abstract class DocumentHandler {

    private DocumentHandler documentHandler;

    public DocumentHandler(DocumentHandler documentHandler) {
        this.documentHandler = documentHandler;
    }

    public void openDocument(String fileExtension){
        if (documentHandler != null)
            documentHandler.openDocument(fileExtension);
    }
}
