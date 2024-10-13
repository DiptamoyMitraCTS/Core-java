//Annotations 
//Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to indicate some additional information which can be used by java compiler and JVM.

//Annotations in Java are used to provide additional information, so it is an alternative option for XML and Java marker interfaces.

//anotation is applicable 
class A {
    // public void show() {
    // System.out.println("in A show");
    // }

    public void showTheDataWhichBeLongsToThisClass() {
        System.out.println("in A show");
    }

}

class B extends A {

    // public void show() {
    // System.out.println("in B show");
    // }

    // @Override
    // public void showTheDataWhichBeLongToThisClass() {
    // System.out.println("in B show");
    // } //The method showTheDataWhichBeLongToThisClass() of type B must override or
    // implement a supertype method
}

public class Hero {

    public static void main(String[] args) {
        B obj = new B();
        // obj.show(); //in B show //showing overridden method of parent class

        obj.showTheDataWhichBeLongsToThisClass(); // in A show

    }

}