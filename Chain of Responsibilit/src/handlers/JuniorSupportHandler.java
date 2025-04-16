package handlers;

public class JuniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        System.out.println("[JuniorSupport] Trying to handle: " + issue);
        if (issue.equals("refund_request") || issue.equals("billing_issue")) {
            System.out.println("[JuniorSupport] Handled " + issue);
        } else if (nextHandler != null) {
            nextHandler.handle(issue);
        } else {
            System.out.println("[JuniorSupport] Cannot handle " + issue + " — escalate manually");
        }
    }
}
