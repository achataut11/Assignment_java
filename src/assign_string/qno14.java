package assign_string;

public class qno14 {
    public static void main(String[] args) {
        String text = "Hello, World";
        char target1 = 'o';
        char target2 = ',';
        
        int firstOccurrence1 = text.indexOf(target1);
        int lastOccurrence1 = text.lastIndexOf(target1);
        
        int firstOccurrence2 = text.indexOf(target2);
        int lastOccurrence2 = text.lastIndexOf(target2);
        
        System.out.println("First occurrence of '" + target1 + "': " + firstOccurrence1);
        System.out.println("Last occurrence of '" + target1 + "': " + lastOccurrence1);
        
        System.out.println("First occurrence of '" + target2 + "': " + firstOccurrence2);
        System.out.println("Last occurrence of '" + target2 + "': " + lastOccurrence2);
    }
}
