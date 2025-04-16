package handlers;

public class SeniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        System.out.println("[SeniorSupport] Trying to handle: " + issue);
        if (issue.equals("account_ban") || issue.equals("data_loss")) {
            System.out.println("[SeniorSupport] Handled " + issue);
        } else {
            throw new UnsupportedOperationException("[SeniorSupport] Cannot handle " + issue + " — escalate manually");
        }
    }
}
