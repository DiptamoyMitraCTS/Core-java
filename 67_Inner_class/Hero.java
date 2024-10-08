//inner class
//non static inner class or member class or instance class or nested class
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

    //if class B is static class then 
    //static class B{
    //     public void config(){
    //         System.out.println("in config");
    //     }
    // }
}

public class Hero {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();//in show

        // B obj1=new B(); //error

        A.B obj1=obj.new B();
        obj1.config();//in config  

        //if inner class becomes static then
        // A.B obj1=new A.B(); 
        // obj1.config();//in config



    }
}
