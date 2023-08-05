
public class Hello {
  public static void main(String[] args) {
    int i = 1;

    while (i <= 4) {
      System.out.println("Hi");
      int j = 1;
      while (j <= 3) {
        System.out.println("hello");
        j++;

      }
      i++;
    }
    System.out.println("Outside loop: " + i);
  }
}

/*
 * Hi
 * hello
 * hello
 * hello
 * Hi
 * hello
 * hello
 * hello
 * Hi
 * hello
 * hello
 * hello
 * Hi
 * hello
 * hello
 * hello
 * Outside loop: 5
 */