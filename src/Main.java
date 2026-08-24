import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[20];

        Student student1 = new Student(
                101,
                "Wisdom",
                18,
                "Computer Science",
                78
        );

        students[0] = student1;

        Student student2 = new Student(
                102,
                "John",
                19,
                "Software Engineering",
                82
        );

        students[1] = student2;

        Student student3 = new Student(
                103,
                "Mary",
                17,
                "Nursing",
                91
        );

        students[2] = student3;

        while (true) {

            System.out.println();
            System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    addStudent(students, scanner);

                    break;

                case 2:

                    viewStudents(students, 0);

                    break;

                case 3:

                    System.out.print("Enter student ID to search: ");
                    int searchId = scanner.nextInt();

                    searchStudent(students, searchId);

                    break;

                case 4:

                    System.out.print("Enter student ID to update: ");
                    int updatedId = scanner.nextInt();

                    updateStudent(students, updatedId);

                    break;

                case 5:

                    System.out.print("Enter student ID to delete: ");
                    int deletedId = scanner.nextInt();

                    deleteStudent(students, deletedId);

                    break;

                case 6:

                    System.out.println("Exit selected. ");

                    scanner.close();

                    return;

                default:

                    System.out.print("Invalid choice. ");
            }
        }
    }

    public static void addStudent(Student[] students, Scanner scanner) {

            for (int i = 0; i < students.length; i++) {

                if (students[i] == null) {

                System.out.print("Enter student ID: ");
                int id = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Enter student name: ");
                String name = scanner.nextLine();

                System.out.print("Enter student age: ");
                int age = scanner.nextInt();

                scanner.nextLine();

                System.out.print("Enter student course: ");
                String course = scanner.nextLine();

                System.out.print("Enter student score: ");
                int score = scanner.nextInt();

                scanner.nextLine();

                students[i] = new Student(
                        id,
                        name,
                        age,
                        course,
                        score
                );

                System.out.println("Student added successfully!");

                return;
            }
        }

        System.out.println("No space available for another student. ");

    }

    public static void viewStudents(Student[] students, int id) {

    for (int i = 0; i < students.length; i++) {

            if (students[i] != null) {

                students[i].displayStudent();

            }
        }
    }

    public static void searchStudent(Student[] students, int id) {

        for (int i =0; i < students.length; i++) {

            if (students[i] != null && students[i].id == id) {

                System.out.println("Student found!");

                students[i].displayStudent();

                return;

            }
        }

        System.out.println("Student not found.");
    }

    public static void updateStudent(Student[] students, int id) {

        for (int i = 0; i < students.length; i++) {

            if (students[i] != null && students[i].id == id) {

                students[i].course = "Computer science";
                students[i].score = 90;

                System.out.println("Student updated successfully!");

                return;
            }
        }

        System.out.println("Student not found.");

    }

    public static void deleteStudent(Student[] students, int id) {

        for (int i = 0; i < students.length; i++)  {

            if (students[i] != null && students[i].id == id) {

                students[i] = null;

                System.out.println("Student deleted successfully!");

                return;
            }
        }

        System.out.println("Studend not found.");

    }

}
