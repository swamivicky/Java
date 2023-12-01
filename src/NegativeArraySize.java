public class NegativeArraySize {
    public static void main(String[] args) {
        try {
            int arr[] = new int[-5];
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
            System.out.println("Program exception continues...");
        }
    }
}
