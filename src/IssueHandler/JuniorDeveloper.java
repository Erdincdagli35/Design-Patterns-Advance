package IssueHandler;

public class JuniorDeveloper extends IssueHandler{

    public JuniorDeveloper(IssueHandler issueHandler) {
        super(issueHandler);
    }

    public void fixIssue(String issuePriority){
        if (issuePriority.equals("low"))
            System.out.println("Junior Manager is fixing JIRA");
        else
            super.fixIssue(issuePriority);
    }
}
