import classes.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Student> students = new ArrayList<>();

    public static void createStudents() {
        // Додаємо студентів з коректними даними
        students.add(new Student(1, "Max", "Verstappen", "Jos",
                "2002-09-30", "Lviv", "+380501234567", "Computer Science", 1, 101));

        students.add(new Student(2, "Charles", "Leclerc", "Herve",
                "2002-03-12", "Lviv", "+380501234568", "Mathematics", 1, 102));

        students.add(new Student(3, "Lewis", "Hamilton", "Anthony",
                "2000-08-20", "Kyiv", "+380501234569", "Computer Science", 2, 101));
    }

    public static void printByFaculty(List<Student> students, String faculty) {
        System.out.println("\nСтуденти факультету '" + faculty + "':");
        boolean found = false;
        for (Student s : students) {
            if (s.getFaculty().equalsIgnoreCase(faculty)) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Студентів на факультеті '" + faculty + "' не знайдено.");
        }
    }

    public static void printBornAfter(List<Student> students, int year) {
        System.out.println("\nСтуденти, народжені після " + year + " року:");
        boolean found = false;
        for (Student s : students) {
            // Розділяємо дату формату "YYYY-MM-DD"
            int birthYear = Integer.parseInt(s.getDateOfBirth().split("-")[0]);
            if (birthYear > year) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Студентів, народжених після " + year + " року, не знайдено.");
        }
    }

    public static void printByGroup(List<Student> students, int group) {
        System.out.println("\nСтуденти групи " + group + ":");
        boolean found = false;
        for (Student s : students) {
            if (s.getGroup() == group) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Студентів у групі " + group + " не знайдено.");
        }
    }

    public static void main(String[] args) {
        createStudents();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть факультет для пошуку:");
        String faculty = sc.nextLine();
        printByFaculty(students, faculty);

        System.out.println("\nВведіть рік (студенти, народжені після цього року):");
        int year = sc.nextInt();
        printBornAfter(students, year);

        System.out.println("\nВведіть номер групи для пошуку:");
        int group = sc.nextInt();
        printByGroup(students, group);

        sc.close();
    }
}