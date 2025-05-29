package com.sarvagna.dsa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DSAOperations ops = new DSAOperations();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Score Manager ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Find Top Scorer");
            System.out.println("5. Sort Scores (Descending)");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter student score: ");
                    int score = sc.nextInt();
                    ops.addStudent(name, score);
                    break;
                case 2:
                    ops.viewAllStudents();
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    Student found = ops.searchStudentByName(searchName);
                    if (found != null)
                        System.out.println("Found: " + found);
                    else
                        System.out.println("Student not found.");
                    break;
                case 4:
                    Student top = ops.getTopScorer();
                    if (top != null)
                        System.out.println("Top Scorer: " + top);
                    else
                        System.out.println("No students found.");
                    break;
                case 5:
                    ops.sortScoresDescending();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 6);
    }
}
