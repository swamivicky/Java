import java.util.Scanner;

class Largest {
    public static void main(String args[]) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x and y value:");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y) {
            System.out.println("Largest number x = " + x);
        } else {
            System.out.println("Largest number y = " + y);
        }

        // Close the Scanner to prevent resource leak
        sc.close();
    }
}
