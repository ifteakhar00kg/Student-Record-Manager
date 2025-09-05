package org.example;

public final class Student {
    private final long id;
    private final String fullName;
    private final String bloodGroup;
    private final float cgpa;

    // Constructor
    public Student(long id, String fullName, String bloodGroup, float cgpa) {
        this.id = id;
        this.fullName = fullName;
        this.bloodGroup = bloodGroup;
        this.cgpa = cgpa;
    }

    // Getters (Encapsulation)
    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public float getCgpa() {
        return cgpa;
    }

    // Print function (no parameters)
    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + fullName);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("CGPA: " + cgpa);
        System.out.println("----------------------");
    }

    // Function to check matching criteria (inside class)
    public boolean matchesQuery(String query) {
        String[] parts = fullName.split(" ");
        String lastName = parts[parts.length - 1];

        return lastName.equalsIgnoreCase(query) || bloodGroup.equalsIgnoreCase(query);
    }
}
