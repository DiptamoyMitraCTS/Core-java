
//Access modifiers
//start
import other.*;

//for Protected access modifier , it works in subclass outside the package
class C extends A {
  public void abc() {
    System.out.println(c);
  }
}

public class Demo {
  public static void main(String[] args) {
    // different package //public variable to access in different package //public access modifier
    A obj = new A();
    System.out.println(obj.marks); // 6
    // obj.show(); //In A show()


    // same package //not require public variable to access in same package //default access modifier //not access in different package
    B obj1 = new B();
    System.out.println(obj1.marks); // 0
    // but method should be public
    // System.out.println(obj1.v); //error: v has private access in B
    
    // Protected access modifier , it works in subclass outside the package //protected access modifier
    C obj2 = new C();
    obj2.abc(); // 9
  }
}