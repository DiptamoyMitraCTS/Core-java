//Access modifiers

import other.* ;
class C extends A{
  public void abc(){
    System.out.println(marks);
  }
}
public class Demo {
    public static void main(String[] args) {
        //different package
       A obj=new A();
       System.out.println(obj.marks); //6
    //    obj.show(); //In A show()

       //same package //not require public variable
       B obj1=new B();
       System.out.println(obj1.marks); //0
       //but method should be public

    }
}