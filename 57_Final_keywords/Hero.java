// final --> variable, method, class

//final class
final class Calc {
    public void show() {
        System.out.println("In Calc show()");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}
// class AdvCalc extends Calc{

// } //The type AdvCalc cannot subclass the final class Calc //because Calc is final class can't inherit it



// final method
class a{
    public final void show(){
        System.out.println("In A show()");
    }
}
class b extends a{
    // public void show(){
    //     System.out.println("In B show()");
    // } //Cannot override the final method from a
}


public class Hero {
    public static void main(String[] args) {
        int num = 9;
        num = 10;
        System.out.println(num); // 10 //we can change

        final int b = 7; // final variable
        // b=8; //error: cannot assign a value to final variable b
        System.out.println(b); // 7

        Calc obj = new Calc();
        obj.show(); // In Calc show()
        obj.add(5, 6); // 11


        b obj3=new b();
        obj3.show(); //In A show()

    }
}
