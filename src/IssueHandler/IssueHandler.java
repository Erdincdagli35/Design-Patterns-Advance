package IssueHandler;

public abstract class IssueHandler {

    private IssueHandler issueHandler;

    public IssueHandler(IssueHandler issueHandler) {
        this.issueHandler = issueHandler;
    }

    public void fixIssue(String subject) {
        if (issueHandler != null)
            issueHandler.fixIssue(subject);
    }
}
