package com.example.demo3;

public class FileAnalysisService {

    public String summarizeFile(String fileContent) {
        // Simple mock summary logic
        if (fileContent == null || fileContent.isEmpty()) {
            return "";
        }
        return "Summary: " + fileContent.substring(0, Math.min(fileContent.length(), 50));
    }
}
