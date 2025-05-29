package com.sarvagna.dsa;

public class DSAOperations {
     Student[] students = new Student[100]; 
     int count = 0; 
    
     void addStudent(String name, int score) {
        if (count < students.length) {
            students[count] = new Student(name, score);
            count++;
        } else {
            System.out.println("Cannot add more students. Limit reached.");
        }
    }

     void viewAllStudents() {
        if (count == 0) {
            System.out.println("No students to show.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(students[i].toString());
        }
    }

     Student searchStudentByName(String name) {
        for (int i = 0; i < count; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                return students[i];
            }
        }
        return null; 
    }

     Student getTopScorer() {
        if (count == 0) 
            return null;

        Student top = students[0];

        for (int i = 1; i < count; i++) {
            if (students[i].getScore() > top.getScore()) {
                top = students[i];
            }
        }

        return top;
    }

     void sortScoresDescending() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (students[j].getScore() < students[j + 1].getScore()) {
                    // swap
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("Students sorted in descending order by score.");
    }

}
