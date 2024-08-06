//this and super method
// every class in java extends Object class 
class A {
    public A() {
        // in every constructor 1st statement is super
        super();  //call the constructor of parent class //call Object class constructor
        System.out.println("In A");
    }

    public A(int n) {
        // in every constructor 1st statement is super
        super();  //call the constructor of parent class
        System.out.println("In A int");
    }

}

class B extends A {

    public B() {
        // in every constructor 1st statement is super
        super();  //call the constructor of parent class
        System.out.println("In B");
    }

    public B(int n) {
        // in every constructor 1st statement is super
        // super(); //call the constructor of parent class
        // super(n) //call A class parameterized constructor
        this(); //this keyword call same class defult constructor
        System.out.println("In B int");
    }
}

public class Hero {
    public static void main(String[] args) {
        B obj = new B(); // create object of B
        // B obj1=new B(2);

        

    }
}
