package assign_string;

public class qno18 {
    public static void main(String[] args) {
        String text = "life is a lie, live your life!";
        String target = "li?e";  // Replace ? with any character
        
        int count = 0;
        for (int i = 0; i <= text.length() - target.length(); i++) {
            if (text.substring(i, i + target.length()).matches(target.replace("?", "."))) {
                count++;
            }
        }
        
        System.out.println("Count of '" + target + "': " + count);
    }
}
