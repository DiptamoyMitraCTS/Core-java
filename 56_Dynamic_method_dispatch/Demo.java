//Dynamic method dispatch


class A{
   public void show(){
         System.out.println("In A show()");
   }
}
class B extends A{
    public void show(){
        System.out.println("In B show()");
  }
}
public class Demo {
    public static void main(String[] args) {
        A obj2=new A();
        obj2.show(); //In A show()

        B obj=new B();
        obj.show(); //In B show()

        A obj1=new B();//refer type A,but implementation B 
        obj1.show(); //In B show()


        //error: incompatible types: A cannot be converted to B
        // B obj3=new A(); //error

        




    }
}
