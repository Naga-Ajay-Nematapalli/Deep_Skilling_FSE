public class DecoratorTest {

    public static void main(String[] args) {

        System.out.println("Email Only");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Server Backup Completed");

        System.out.println("\nEmail + SMS");
        Notifier emailAndSMS =
                new SMSNotifierDecorator(
                        new EmailNotifier());

        emailAndSMS.send("Monthly Report Generated");

        System.out.println("\nEmail + SMS + Slack");
        Notifier allChannels =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        allChannels.send("Critical Security Alert");
    }
}