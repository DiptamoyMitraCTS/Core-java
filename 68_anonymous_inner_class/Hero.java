//Annonymous inner class
//Annonymous inner class is a class that is declared and instantiated at the same time.


class A{
    public void show(){
        System.out.println("in show");
    }
}

//when we need to change the behaviour of show method then we used method overridding but if we want to change the behaviour of show method only once then we use annonymous inner class 


public class Hero {
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                System.out.println("in show annonymous inner class New");
            }
        };
        obj.show();//in show annonymous inner class New
    }
}
