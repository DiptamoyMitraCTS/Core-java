//need of interface is to achieve multiple inheritance in java
//interface is a keyword in java which is used to achieve multiple inheritance in java 
//interface is a reference type in java which is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface. Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types. Method bodies exist only for default methods and static methods. 
//Interfaces cannot be instantiated—they can only be implemented by classes or extended by other interfaces.
//interface is a blueprint of a class 

class Laptop{
    public void code(){
        System.out.println("Coding , compilile..");
    }
}
class Desktop{
    public void code(){
        System.out.println("faster....Coding , compilile..");
    }
}

class Developer{
    public void develop(Laptop l){
        System.out.println("Developing app..");
        l.code(); //Coding , compilile..
    }
}


public class Hero {
    public static void main(String[] args) {
        Laptop hp=new Laptop();
        Desktop dell=new Desktop();

        Developer navin=new Developer();
        // navin.develop(); //Developing app..

        navin.develop(); //Developing app..
        //now i want to use Desktop class object then i have to create another method in Developer class or developer can't able to use desktop this is the problem. 


    }   
}
