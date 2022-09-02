package IssueHandler;

public class SeniorDeveloper extends IssueHandler{

    public SeniorDeveloper(IssueHandler issueHandler) {
        super(issueHandler);
    }

    public void fixIssue(String issuePriority){
        if (issuePriority.equals("mid"))
            System.out.println("Senior Developer is fixing JIRA");
        else
            super.fixIssue(issuePriority);
    }
}
