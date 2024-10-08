//inner class

class A{

    int age;
    public void show(){
        System.out.println("in show");
    }


    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}

public class Hero {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();//in show

        // B obj1=new B(); //error

        

    }
}
