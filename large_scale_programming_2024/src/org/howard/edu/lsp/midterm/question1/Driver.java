// Chukwuemeka Ojih

package org.howard.edu.lsp.midterm.question1;

public class Driver {
    public static void main(String[] args) {
        // Test cases to ensure the encrypt method covers a variety of scenarios
        String[] testStrings = {
            "I love CSCI363",      // Original test case with mixed case and numbers
        };

        // Loop through all test cases
        for (String originalText : testStrings) {
            String encryptedText = SecurityOps.encrypt(originalText);
            System.out.println("Original text: " + originalText);
            System.out.println("Encrypted text: " + encryptedText);
            System.out.println();  // Print a blank line for better readability between cases
        }
    }
}