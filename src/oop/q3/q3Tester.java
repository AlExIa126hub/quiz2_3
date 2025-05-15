package oop.q3;

public class q3Tester {
  public static void main(String[] args) {
    University university = new University(5);

    Student student1 = new Student("John", "Doe", "USA", "Info1");
    Student student2 = new Student("Jane", "Smith", "Canada", "Info2");
    Student student3 = new Student("Alice", "Johnson", "UK", "Info3");

    university.addStudent(student1);
    university.addStudent(student2);
    university.addStudent(student3);

    System.out.println("Students in the university:");
    university.printStudents();

    university.removeStudent(student2);

    System.out.println("Students in the university after removal:");
    university.printStudents();

    System.out.println("Get student info strange:");
    System.out.println(university.getStudentInfoStrange(student1));
  }
}
