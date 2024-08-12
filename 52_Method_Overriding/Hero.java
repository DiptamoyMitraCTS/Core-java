// Method Overriding
//same method name and same no. of parameter present.
//at first scan sub class , then parent class because we create sub class object
class A{
    public void show(){
        System.out.println("In A show");
    }
    public void config(){
        System.out.println("In A config");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

public class Hero {
    public static void main(String[] args) {
        B obj=new B();
        obj.show(); //In B show //override method of parent class
        obj.config(); //In A config
    }    
}
