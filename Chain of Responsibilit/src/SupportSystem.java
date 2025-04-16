import handlers.*;

import java.util.Arrays;
import java.util.List;

public class SupportSystem {
    public static void main(String[] args) {
        List<SupportHandler> handlers = Arrays.asList(
                new FAQBotHandler(),
                new JuniorSupportHandler(),
                new SeniorSupportHandler()
        );

        for (int i = 0; i < handlers.size() - 1; i++) {
            handlers.get(i).setNext(handlers.get(i + 1));
        }

        SupportHandler supportChain = handlers.get(0);

        String[] issues = {"password_reset", "refund_request", "account_ban", "unknown_bug"};

        for (String issue : issues) {
            try {
                supportChain.handle(issue);
            } catch (UnsupportedOperationException e) {
                System.out.println("Exception: " + e.getMessage());
            }
            System.out.println("-----");
        }
    }
}
