package assign_string;
public class qno19 {
    public static void main(String[] args) {
        String text = "This is a test. This is only a test.";
        String target = "is";
        
        int lastIndex = text.lastIndexOf(target);
        
        if (lastIndex != -1) {
            System.out.println("Last index of '" + target + "': " + lastIndex);
        } else {
            System.out.println("'" + target + "' not found in the text.");
        }
    }
}