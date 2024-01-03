package studentManagement;

import java.util.Scanner;

public class StudentManagementSystem 
{

    public static void main(String[] args) {

        Student[] studentArray = new Student[100];
        int studentCount = 0; // Track the number of students in the array
        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
    	System.out.println("**********************************************");
    	System.out.println();
        System.out.println("*****  Student Record Management System  *****");
        System.out.println();
        System.out.println("**********************************************");
        

        while (true) {
        	System.out.println();
            System.out.println("1. Add a new student");
            System.out.println("2. Display all students");
            System.out.println("3. Search for a student by name");
            System.out.println("4. Update student information");
            System.out.println("5. Delete a student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    studentArray[studentCount] = new Student(name, rollNumber, age);
                    studentCount++;
                    System.out.println();
                    System.out.println("Student added successfully!");
                    System.out.println("----------------------------------------");
                    break;

                case 2:
                    System.out.println("\nList of all students:");
                    System.out.println();
                    for (int i = 0; i < studentCount; i++) {
                        System.out.println(studentArray[i].getInfo());
                    }
                    System.out.println("----------------------------------------");
                    break;

                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    for(int i = 0; i < studentCount; i++) {
                        if (studentArray[i].getName().equalsIgnoreCase(searchName)) {
                        	System.out.println();
                            System.out.println("Student found:\n" + studentArray[i].getInfo());
                            found = true;
                            System.out.println("----------------------------------------");
                            break;
                        }
                    }
                    if (!found) {
                    	System.out.println();
                        System.out.println("Student not found.");
                        System.out.println("----------------------------------------");
                    }
                    break;

                case 4:
                    System.out.print("Enter student name to update: ");
                    String updateName = scanner.nextLine();
                    found = false;
                    for(int i = 0; i < studentCount; i++) {
                        if (studentArray[i].getName().equalsIgnoreCase(updateName)) {
                            System.out.print("Enter new name: ");
                            studentArray[i].setName(scanner.nextLine());
                            System.out.print("Enter new age: ");
                            studentArray[i].setAge(scanner.nextInt());
                            System.out.println();
                            System.out.println("Student information updated successfully!");
                            System.out.println("-----------------------------------------");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                    	System.out.println();
                        System.out.println("Student name not found.");
                        System.out.println("----------------------------------------");
                    }
                    break;	

                case 5:
                    System.out.print("Enter student name to delete: ");
                    String deleteName = scanner.nextLine();
                    found = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (studentArray[i].getName().equalsIgnoreCase(deleteName)) {
                            for (int j = i; j < studentCount - 1; j++) {
                                studentArray[j] = studentArray[j + 1];
                            }
                            studentCount--;
                            System.out.println();
                            System.out.println("Student deleted successfully!");
                            System.out.println("----------------------------------------");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                    	System.out.println();
                        System.out.println("Student not found.");
                        System.out.println("----------------------------------------");
                    }
                    break;

                case 6:
                	System.out.println("**********************************************");
                    System.out.println();
                    System.out.println("....................Byee Byee.................");
                    System.out.println();
                	System.out.println("**********************************************");
                    System.out.println();
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
