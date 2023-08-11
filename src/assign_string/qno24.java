package assign_string;

public class qno24 {
    public static void main(String[] args) {
        String mainString = "This is a test string.";
        String subString = "test";
        
        boolean contains = mainString.contains(subString);
        
        if (contains) {
            System.out.println("The main string contains the substring.");
        } else {
            System.out.println("The main string does not contain the substring.");
        }
    }
}
