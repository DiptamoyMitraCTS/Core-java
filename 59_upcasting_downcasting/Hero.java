// Upcasting and downcasting in Java

class A{

    public void show1(){
      System.out.println("in A show1");  
    }
    
}
class B extends A{
    public void show2(){
        System.out.println("in B show2");
    }
}

public class Hero {
     public static void main(String[] args) {
         //type casting
        double d=8.9;
        // int i=d; //not support
        int i=(int)d; //explicitly type casting
        System.out.println(i); //8

        //upcasting and downcasting
        A obj=new A();
        obj.show1();
        // obj.show2(); //not support because show2() is not in A class so it is not accessible by obj reference of A class
        
        obj=new B(); //upcasting //B class object can be referred by A class reference variable obj      
        
        B obj1=(B)obj; //downcasting //A class reference variable obj can be referred by B class object
        obj1.show1(); //in A show1
        




     }
}
