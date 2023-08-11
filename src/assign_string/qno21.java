package assign_string;

public class qno21{
    public static void main(String[] args) {
        String input = "Hello, world!";
        char target = 'o';
        
        StringBuilder result = new StringBuilder();
        result.append(input.charAt(0));
        
        for (int i = 1; i < input.length() - 1; i++) {
            if (input.charAt(i) != target) {
                result.append(input.charAt(i));
            }
        }
        
        result.append(input.charAt(input.length() - 1));
        
        System.out.println("Original: " + input);
        System.out.println("Modified: " + result.toString());
    }
}
