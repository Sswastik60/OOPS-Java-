package StringHandling;
import java.util.Scanner;
import java.util.Arrays;

public class StringMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Alphabetical Order");
            System.out.println("3. Reverse String");
            System.out.println("4. Concatenate Original + Reversed");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (isPalindrome(str))
                        System.out.println("Palindrome!");
                    else
                        System.out.println("Not a Palindrome.");
                    break;

                case 2:
                    System.out.println("Alphabetical Order: " + sortString(str));
                    break;

                case 3:
                    System.out.println("Reversed String: " + reverseString(str));
                    break;

                case 4:
                    String reversed = reverseString(str);
                    String concatenated = str + reversed; // no StringBuilder
                    System.out.println("Concatenated: " + concatenated);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }

    // Check palindrome
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    // Sort string alphabetically
    public static String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    // Reverse string
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        String rev = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            rev += arr[i]; // concatenation without StringBuilder
        }
        return rev;
    }
}