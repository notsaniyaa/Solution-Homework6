package handlers;

public class FAQBotHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        System.out.println("[FAQBot] Trying to handle: " + issue);
        if (issue.equals("password_reset")) {
            System.out.println("[FAQBot] Handled " + issue);
        } else if (nextHandler != null) {
            nextHandler.handle(issue);
        } else {
            System.out.println("[FAQBot] Cannot handle " + issue + " — escalate manually");
        }
    }
}
