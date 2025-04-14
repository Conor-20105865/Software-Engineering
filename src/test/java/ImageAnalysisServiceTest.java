import com.example.demo3.ImageAnalysisService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class ImageAnalysisServiceTest {


   //check for non null return and expected text output
    @Test
    void testExtractTextFromImageReturnsText() {
        ImageAnalysisService imageService = new ImageAnalysisService();
        String fakeImageData = "mockImageBytesHere";

        String extractedText = imageService.extractTextFromImage(fakeImageData);

        //ensure null not returned
        assertNotNull(extractedText);
        //simulated respnse
        assertTrue(extractedText.contains("Extracted"));
    }


    //empty image returns empty string
    @Test
    void testExtractTextFromImageWithEmptyInput() {
        ImageAnalysisService imageService = new ImageAnalysisService();
        String extractedText = imageService.extractTextFromImage("");

        assertEquals("", extractedText);
    }


    //null returns epmty string with no crash
    @Test
    void testExtractTextFromImageWithNullInput() {
        ImageAnalysisService imageService = new ImageAnalysisService();
        String extractedText = imageService.extractTextFromImage(null);

        assertEquals("", extractedText);
    }
}


