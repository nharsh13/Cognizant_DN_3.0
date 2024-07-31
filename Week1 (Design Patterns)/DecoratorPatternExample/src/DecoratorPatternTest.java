public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create an email notifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate it with SMS and Slack notifiers
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send notifications
        slackNotifier.send("This is a test notification.");
    }
}
