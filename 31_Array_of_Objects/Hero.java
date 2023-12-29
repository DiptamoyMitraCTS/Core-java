
class Student {
  int rollno;
  String name;
  int marks;
}

public class Hero {
  public static void main(String[] args) {
    // manually create objects
    Student s1 = new Student();
    s1.rollno = 1;
    s1.name = "Navin";
    s1.marks = 80;

    Student s2 = new Student();
    s2.rollno = 2;
    s2.name = "Diptamoy";
    s2.marks = 40;

    Student s3 = new Student();
    s3.rollno = 3;
    s3.name = "Rahul";
    s3.marks = 90;

    // System.out.println(s1); //Student@2f92e0f4

    // make array of objects, and assign objects individually in it
    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i].name + " : " + students[i].marks);

    }

  }
}
// output
/*
 * Navin : 80
 * Diptamoy : 40
 * Rahul : 90
 */
