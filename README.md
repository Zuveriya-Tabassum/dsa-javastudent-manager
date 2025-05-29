# Student Score Manager using DSA (Java)

This is a Java console application developed as part of the **SARVAGNA INNOVATION PRIVATE LIMITED - Week 1 DSA Task**. The application helps manage student records by storing their names and scores and provides operations to search, sort, and display information using core data structures and algorithms.

---

## 📌 What the Project Does

This project allows you to:
- Add student name and score
- View all student details
- Search for a student by name
- Identify the top scorer
- Sort students by score in descending order

The program is menu-driven and runs entirely in the console.

---

## 💡 DSA Concepts Used

- **Arrays**: Used to store student records in a fixed-size array of custom `Student` objects.
- **Array Traversal**: For displaying or searching through the list.
- **Linear Search**: To search a student by name.
- **Bubble Sort**: Used to sort students by score in descending order.
- **Object-Oriented Programming**: Implemented with custom classes (`Student`, `DSAOperations`, `Main`).

---

## ⚙️ How to Run the Program

1. **Compile the code**
   Open your terminal in the project root folder and run:

   ```bash
   javac com/sarvagna/dsa/*.java

2. **Run the code**
   ```bash
   java com.sarvagna.dsa.Main

---

## Sample Output
 --- Student Score Manager ---
1. Add Student
2. View All Students
3. Search Student by Name
4. Find Top Scorer
5. Sort Scores (Descending)
6. Exit
Enter choice: 1
Enter student name: Alice
Enter student score: 85

--- Student Score Manager ---
1. Add Student
2. View All Students
3. Search Student by Name
4. Find Top Scorer
5. Sort Scores (Descending)
6. Exit
Enter choice: 1
Enter student name: Bob
Enter student score: 92

--- Student Score Manager ---
1. Add Student
2. View All Students
3. Search Student by Name    
4. Find Top Scorer
5. Sort Scores (Descending)  
6. Exit
Enter choice: 1
Enter student name: Charlie
Enter student score: 78

--- Student Score Manager ---
1. Add Student
2. View All Students
3. Search Student by Name    
4. Find Top Scorer
5. Sort Scores (Descending)  
6. Exit
Enter choice: 2
Name: Alice, Score: 85       
Name: Bob, Score: 92
Name: Charlie, Score: 78     

--- Student Score Manager ---
1. Add Student
2. View All Students
3. Search Student by Name
4. Find Top Scorer
5. Sort Scores (Descending)
6. Exit
Enter choice: 3
Enter name to search: Bob
Found: Name: Bob, Score: 92

1. Add Student
2. View All Students
3. Search Student by Name
4. Find Top Scorer
5. Sort Scores (Descending)
6. Exit
Enter choice: 5
Students sorted in descending order by score.

--- Student Score Manager ---
1. Add Student
2. View All Students
3. Search Student by Name
4. Find Top Scorer
5. Sort Scores (Descending)
6. Exit
Enter choice: 2
Name: Bob, Score: 92
Name: Alice, Score: 85
Name: Charlie, Score: 78

--- Student Score Manager ---
1. Add Student
2. View All Students
3. Search Student by Name
4. Find Top Scorer
5. Sort Scores (Descending)
6. Exit
Enter choice: 6
Exiting...
