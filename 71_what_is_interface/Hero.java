//what is interface
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
