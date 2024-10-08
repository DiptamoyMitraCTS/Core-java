// 

abstract class A{
    public abstract void show();
public abstract  void display();
}

// class B extends A{
//     @Override
//     public void show(){
//         System.out.println("in B show");
//     }
// }
//the purpouse of abstract class is to provide some common functionality to the child class and some abstract method which child class has to implement 

//alss B only use to change the behaviour of show method so we can use annonymous inner class here 
//we can use annonymous inner class to change the behaviour of show method only once


public class Hero {
    public static void main(String[] args) {
        // A obj=new A(); //can't instantiate abstract class


        // A obj=new B();
        // obj.show(); //in B show

        A obj=new A(){ 
            public void show(){
                System.out.println("in show annonymous inner class New");
            }
            public void display(){
                System.out.println("in display annonymous inner class New");
            }
        }; //we create object of anonymous inner class not abstract class A
        obj.show();//in show annonymous inner class New
        obj.display();//in display annonymous inner class New


    }
}
