package assign_string;

public class qno20 {
    public static void main(String[] args) {
        String mainString = "Hello, world!";
        String prefix = "Hello";
        
        boolean startsWith = mainString.startsWith(prefix);
        
        if (startsWith) {
            System.out.println("The main string starts with '" + prefix + "'.");
        } else {
            System.out.println("The main string does not start with '" + prefix + "'.");
        }
    }
}

