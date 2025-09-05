package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Student> students = new ArrayList<>();

        // Input students
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("ID: ");
            long id = sc.nextLong();
            sc.nextLine();

            System.out.print("Full Name: ");
            String fullName = sc.nextLine();

            System.out.print("Blood Group: ");
            String bloodGroup = sc.nextLine();

            System.out.print("CGPA: ");
            float cgpa = sc.nextFloat();
            sc.nextLine();

            students.add(new Student(id, fullName, bloodGroup, cgpa));
        }

        // Query string
        System.out.print("\nEnter query (last name or blood group): ");
        String query = sc.nextLine();

        // Print matching students
        System.out.println("\nMatching Students:");
        boolean found = false;
        for (Student s : students) {
            if (s.matchesQuery(query)) {
                s.printInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching students found.");
        }

        // Find student with lowest CGPA
        Student lowest = findLowestCgpa(students);
        System.out.println("\nStudent with lowest CGPA:");
        lowest.printInfo();

        sc.close();
    }

    // Function outside Student class
    public static Student findLowestCgpa(List<Student> students) {
        Student lowest = students.get(0);
        for (Student s : students) {
            if (s.getCgpa() < lowest.getCgpa()) {
                lowest = s;
            }
        }
        return lowest;
    }
}
