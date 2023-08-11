package assign_string;

public class qno17 {
    public static void main(String[] args) {
        String word = "Umbrella";
        char target = 'e';
        
        if (word.contains(Character.toString(target))) {
            System.out.println("'" + target + "' is present in the word.");
        } else {
            System.out.println("'" + target + "' is not present in the word.");
        }
    }
}

