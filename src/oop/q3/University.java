package oop.q3;

public class University {
  private Student[] students;
  private int studentCount;

  // Constructor
  public University(int capacity) {
    students = new Student[capacity];
    studentCount = 0;
  }

  // Method to add a student
  public void addStudent(Student s) {
    if (studentCount < students.length) {
      students[studentCount] = s;
      studentCount++;
    } else {
      System.out.println("University is full, cannot add more students.");
    }
  }

  // Method to remove a student
  public boolean removeStudent(Student s) {
    for (int i = 0; i < studentCount; i++) {
      if (students[i].equals(s)) {
        for (int j = i; j < studentCount - 1; j++) {
          students[j] = students[j + 1];
        }
        students[studentCount - 1] = null;
        studentCount--;
        return true;
      }
    }
    return false;
  }

  // Method to print all students
  public void printStudents() {
    for (int i = 0; i < studentCount; i++) {
      System.out.println(students[i].getName() + " " + students[i].getSurname());
    }
  }

  // Method to get student info strange
  public String getStudentInfoStrange(Student s) {
    if (s.equals(this)) {
      if (isStudentInUniversity(s)) {
        return "Current semester course titles from Argus";
      } else {
        return "Your personal number from Argus";
      }
    } else {
      if (isStudentInUniversity(s)) {
        return s.getInfo();
      } else {
        return null;
      }
    }
  }

  // Helper method to check if a student is in the university
  private boolean isStudentInUniversity(Student s) {
    for (int i = 0; i < studentCount; i++) {
      if (students[i].equals(s)) {
        return true;
      }
    }
    return false;
  }

}
