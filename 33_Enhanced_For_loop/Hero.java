
class Student {
  int rollno;
  String name;
  int marks;
}

public class Hero {
  public static void main(String[] args) {
    int num[] = new int[4];
    num[0] = 4;
    num[1] = 8;
    num[2] = 3;
    num[3] = 9;

    for (int n : num) {
      System.out.println(n); // 4 8 3 9
    }

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

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    //enhanced for loop
    for (Student stud : students) {
      System.out.println(stud.name + " : " + stud.marks);
    }

  }
}
// output
/*
 * Navin : 80
 * Diptamoy : 40
 * Rahul : 90
 */
