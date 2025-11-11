package sess03;

/**
 * Java program to search for some text in a paragraph using a while loop
 *
 * @author vkoech
 */
public class TextSearch {

    // main method begins program execution
    public static void main(String args[]) {

        // paragraph to search text within
        String paragraph = """
                           When you work on a table, click where you want to add a row or a column, and then click the plus sign. Reading is easier, too, in the new Reading view. You can collapse parts of the document and focus on the text you want. If you need to stop reading before you reach the end, Word remembers where you left off - even on another device. Video provides a powerful way to help you prove your point. When you click Online Video, you can paste in the embed code for the video you want to add. You can also type a keyword to search online for the video that best fits your document. To make your document look professionally produced, Word provides header, footer, cover page, and text box designs that complement each other.
                           """;

        // Word/Text to search for
        String textToSearch = "other";
        boolean found = false;

        int index = 0;

        // Use a while loop to search for the text
        while (index < paragraph.length()) {
            // Check if the substring matches the text to search
            if (index + textToSearch.length() <= paragraph.length() &&
                paragraph.substring(index, index + textToSearch.length()).equals(textToSearch)) {
                found = true;
                break; // Exit the loop if text is found
            }
            index++; // Move to the next index in the paragraph
        }

        // Output the result of the search
        if (found) {
            System.out.println("Text '" + textToSearch + "' found in the paragraph.");
        } else {
            System.out.println("Text '" + textToSearch + "' not found in the paragraph.");
        }
    }
    
}
