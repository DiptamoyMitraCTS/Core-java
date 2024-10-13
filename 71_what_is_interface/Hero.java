//what is interface
//The interface in Java is a mechanism to achieve abstraction. Traditionally, an interface could only have abstract methods (methods without a body) and public, static, and final variables by default. It is used to achieve abstraction and multiple inheritances in Java. In other words, interfaces primarily define methods that other classes must implement. Java Interface also represents the IS-A relationship.


// Abstract is existing in thought or as an idea but not having a physical or concrete existence

//Java abstract class is a class that can not be instantiated by itself, it needs to be subclassed by another class to use its properties

//if only have abstract method
interface A{
    //all the method bydefault abstract and public
    //interface just show us design
    public abstract void show();
    public abstract void config();

    // int age; //error  face because they are bydefault final and static
    int age=90;
    String area="Mumbai";
} 

class B implements A{
    //we need to must implements both method if not then the class becomes abstract
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}

public class Hero {
    public static void main(String[] args) {
        A obj;
        // obj=new A(); //can't instantiate

        obj=new B();
        obj.show(); //in show
        obj.config(); // in config
        System.out.println(A.area);//Mumbai
      //  A.area="Delhi";//cannot assign a value to static final variable 


    }
}
