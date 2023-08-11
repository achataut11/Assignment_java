package assign_string;

public class qno13 {
    public static void main(String[] args) {
        String sentence = "This is orange juice";
        String target = "orange";
        
        if (sentence.contains(target)) {
            System.out.println("'" + target + "' is present in the sentence.");
        } else {
            System.out.println("'" + target + "' is not present in the sentence.");
        }
    }
}
