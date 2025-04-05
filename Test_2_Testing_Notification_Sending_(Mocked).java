import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceTest {

    @Test
    public void testSendNotification() {
        NotificationService notify = new NotificationService();
        String result = notify.send("Reminder: Upload project draft by Friday.");

        assertEquals("Notification sent: Reminder: Upload project draft by Friday.", result);
    }
}
//What's happening?
//We're simulating a notification system.
//It sends a reminder to the user.
//The test ensures the format of the message is correct.

