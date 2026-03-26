package StringHandling;
import java.util.Scanner;
import java.util.Arrays;

class Student {
    private String name;
    private int rollNo;

    // Parameterized constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // i. Extract initials
    public String extractInitials() {
        String[] words = name.split(" ");
        String initials = "";
        for (String word : words) {
            if (word.length() > 0) {
                initials += Character.toUpperCase(word.charAt(0));
            }
        }
        return initials;
    }

    // ii. Remove whitespace
    public String removeWhitespace() {
        return name.replaceAll("\\s+", "");
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Display student details
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Initials: " + extractInitials());
        System.out.println("Without Whitespace: " + removeWhitespace());
        System.out.println("-----------------------------");
    }
}

public class StudentString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        // Read student details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            students[i] = new Student(rollNo, name);
        }

        // Display details
        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            s.display();
        }

        // iii. List names containing a substring
        System.out.print("\nEnter substring to search: ");
        String sub = sc.nextLine();
        System.out.println("Names containing \"" + sub + "\":");
        for (Student s : students) {
            if (s.getName().toLowerCase().contains(sub.toLowerCase())) {
                System.out.println(s.getName());
            }
        }

        // iv. Sort students alphabetically
        Arrays.sort(students, (a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        System.out.println("\n--- Students Sorted Alphabetically ---");
        for (Student s : students) {
            System.out.println(s.getName());
        }

        sc.close();
    }
}