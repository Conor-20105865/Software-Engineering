import com.example.demo3.FileAnalysisService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class FileAnalysisServiceTest {

    //test for correct summary format
    @Test
    void testSummarizeFileReturnsSummary() {
        FileAnalysisService fileService = new FileAnalysisService();
        String fakeFileContent = "This is a long document about machine learning and data science.";

        String summary = fileService.summarizeFile(fakeFileContent);

        assertNotNull(summary);
        assertTrue(summary.contains("Summary"));
    }

    //empmty string returns null
    @Test
    void testSummarizeFileWithEmptyInput() {
        FileAnalysisService fileService = new FileAnalysisService();
        String summary = fileService.summarizeFile("");

        assertEquals("", summary);
    }


    //null returns empty sumarry
    @Test
    void testSummarizeFileWithNullInput() {
        FileAnalysisService fileService = new FileAnalysisService();
        String summary = fileService.summarizeFile(null);

        assertEquals("", summary);
    }
}

