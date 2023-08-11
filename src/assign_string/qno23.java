package assign_string;

public class qno23 {
    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuvwxyz";
        
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < input.length(); i += 2) {
            result.append(input.charAt(i));
        }
        
        System.out.println("Characters from even positions: " + result.toString());
    }
}
