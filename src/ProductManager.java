public class ProductManager extends IssueHandler{

    public ProductManager(IssueHandler issueHandler) {
        super(issueHandler);
    }

    public void fixIssue(String issuePriority){
        if (issuePriority.equals("high"))
            System.out.println("Product Manager is fixing JIRA");
        else
            super.fixIssue(issuePriority);
    }
}
