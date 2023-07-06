package assign_function;

public class qno16 {
	public static void main(String[] args) {
        String sentence = "I want to be a software engineer.";

        int wordCount = countWords(sentence);
        System.out.println("Word count: " + wordCount);
    }

    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}
