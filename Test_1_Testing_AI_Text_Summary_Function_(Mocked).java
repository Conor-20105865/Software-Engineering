import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AIServiceTest {

    @Test
    public void testSummarizeText() {
        AIService service = new AIService();

        String input = "College students need quick summaries of lecture notes to revise efficiently.";
        String summary = service.summarizeText(input);

        assertNotNull(summary);
        assertTrue(summary.toLowerCase().contains("summary"));
    }
}
//What's happening?
//We're pretending we have a method that summarizes text.
//We pass it a realistic student-use case sentence.
//We check that the method doesn't return null and contains the word "summary".