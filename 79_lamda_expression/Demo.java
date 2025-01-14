//functional interface lamda expression
// this is very important
@FunctionalInterface
interface A {
    void show(int i); // which has only one method

}

public class Demo {
    public static void main(String[] args) {

        //lambda expression to implement functional interface A
        A obj = (int i) -> System.out.println("in show " + i);

        obj.show(5); // in show 5
    }
}
