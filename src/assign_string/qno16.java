package assign_string;

public class qno16 {
    public static void main(String[] args) {
        String input = "Hello, have a good day";
        char replacement = '*';  // Replace consonants with this character
        
        String result = input.replaceAll("[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz]", String.valueOf(replacement));
        
        System.out.println("Original: " + input);
        System.out.println("Modified: " + result);
    }
}

