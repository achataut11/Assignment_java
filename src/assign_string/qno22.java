package assign_string;

public class qno22 {
    public static void main(String[] args) {
        String input = "0123456789";
        int[] selectedIndexes = {0, 1, 2, 5, 6, 7};
        
        StringBuilder result = new StringBuilder();
        
        for (int index : selectedIndexes) {
            if (index >= 0 && index < input.length()) {
                result.append(input.charAt(index));
            }
        }
        
        System.out.println("Selected characters: " + result.toString());
    }
}