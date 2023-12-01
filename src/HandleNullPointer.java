public class HandleNullPointer {
    public static void main(String[] args) {
        try {
            String str = null;
            // Attempting to access a method or property on a null reference
            int length = str.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            // Handling the NullPointerException
            e.printStackTrace();
            System.out.println("NullPointerException caught!");
        } finally {
            // Displaying a message to the user in the finally block
            System.out.println("Program execution complete.");
        }
    }
}
