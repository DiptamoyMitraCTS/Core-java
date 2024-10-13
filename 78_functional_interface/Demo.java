//functional interface

@FunctionalInterface
interface A {
    void show(); //which has only one method

}

// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }
// }

public class Demo {
    public static void main(String[] args) {
          A obj=new A(){
            public void show(){
              System.out.println("in show");
            }
          };
          obj.show(); //in show
    }
}
