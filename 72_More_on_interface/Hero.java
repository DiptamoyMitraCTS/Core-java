//more on interface
interface A{
    //all the method bydefault abstract and public
    //interface just show us design
    public abstract void show();
    public abstract void config();

    // int age; //error  face because they are bydefault final and static
    int age=90;
    String area="Mumbai";
} 

interface  X{
  void run();
}

interface  Y extends X{
      int d=8;
}

//it can implements multiple interfaces
class B implements A,Y{
    //we need to must implements both method if not then the class becomes abstract
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("in run");
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
        // obj.run(); //The method run() is undefined for the type A

        Y obj1=new B();
        obj1.run(); //in run

    }
}

//class--class ->extends
//interface--interface ->extends
//class-interface ->implements