public class Main {

    public static void main(String[] args) {
        System.out.println("Chain of Responsibility\n\n");

        System.out.println("DocumentHandler Example:");
        DocumentHandler documentHandler = new SpreadsheetHandler(new SlideshowHandler(new TextDocumentHandler(null)));

        documentHandler.openDocument("ppt");
        documentHandler.openDocument("txt");

        System.out.println("\nIssueHandle Example:");
        IssueHandler issueHandler = new ProductManager(new SeniorDeveloper(new JuniorDeveloper(null)));

        issueHandler.fixIssue("mid");
        issueHandler.fixIssue("low");
    }
}
