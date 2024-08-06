//Anomymous object

// obj----->101  //reference variable             Heap ---->create object---> | obj |(show()) (101)

class A{
    public A(){
        System.out.println("Object created");
    }
    public void show(){
        System.out.println("In A show");
    }
}

public class Hero {
    public static void main(String[] args) {
      //  A obj=new A(); //create object and call default constructor
      //  obj.show(); //In A show


      //now not create refernce variable, just create object
        new A(); //Object created //Anonymous object //no referece //problem is no re-use them
        new A().show(); //In A show 
        new A(); //create another object //we'll not re-use previous object //Object created
    }
}
