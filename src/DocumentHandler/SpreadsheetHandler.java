package DocumentHandler;

public class SpreadsheetHandler extends DocumentHandler{

    public SpreadsheetHandler(DocumentHandler documentHandler) {
        super(documentHandler);
    }

    public void openDocument(String fileExtension){
        if (fileExtension.equals("xlsx"))
            System.out.println("Opening spread sheet document...");
        else
            super.openDocument(fileExtension);
    }
}
