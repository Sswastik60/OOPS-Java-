package StringHandling;
import java.util.Scanner;

class Employee {
    private String name;
    private int id;

    // Parameterized constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to format employee name
    public String formatEmployeeName() {
        String[] words = name.split(" ");
        String formatted = "";

        for (String word : words) {
            if (word.length() > 0) {
                formatted += Character.toUpperCase(word.charAt(0))+ word.substring(1).toLowerCase()+ " ";
            }
        }
        return formatted.trim();
    }

    // Method to generate email
    public String generateEmail() {
        String[] parts = formatEmployeeName().split(" ");
        String email = "";

        if (parts.length >= 2) {
            String firstName = parts[0];
            String lastName = parts[parts.length - 1];
            email = (firstName.charAt(0) + lastName).toLowerCase() + "@example.com";
        } else {
            email = parts[0].toLowerCase() + "@example.com";
        }
        return email;
    }

    // Display employee details
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Original Name: " + name);
        System.out.println("Formatted Name: " + formatEmployeeName());
        System.out.println("Generated Email: " + generateEmail());
        System.out.println("-----------------------------");
    }
}

public class EmployeeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Employee[] employees = new Employee[n];

        // Read employee details
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            employees[i] = new Employee(id, name);
        }

        // Display details
        System.out.println("\n--- Employee Details ---");
        for (Employee emp : employees) {
            emp.display();
        }

        sc.close();
    }
}
