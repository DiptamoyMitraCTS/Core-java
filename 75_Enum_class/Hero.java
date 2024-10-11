//enum class
//can't extends in enum
//we create objects in same class itself
enum Status {
    // objects of status or constants
    Running, Failed, Pending, Success;
}

enum Laptop {
    MacBook(2000), XPS(1000), Surface(500), Thinkpad(100), hp; // objects

    private int price;

    private Laptop() { // default constractor
        this.price = 1;
        System.out.println("for Hp in default constractor " + this.price);
    }

    private Laptop(int price) {
        System.out.println("in Laptop constructor " + this.name());
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    // not require
    // public void setPrice(int price) {
    // System.out.println("in setPrice ");
    // this.price = price;
    // }

}

public class Hero {
    public static void main(String[] args) {
        Status s = Status.Running;
        // System.out.println(s.getClass().getSuperclass()); // class java.lang.Enum

        Laptop lap = Laptop.MacBook;
        // System.out.println(lap); //Macbook
        // System.out.println(lap+ " : "+lap.getPrice()); //MacBook : 2000

        // iterate all the laptops
        for (Laptop i : Laptop.values()) {
            System.out.println(i + " : " + i.getPrice()); // MacBook : 2000, XPS : 1000, Surface : 500, Thinkpad : 100, hp : 1
                                            
        }
    }
}

/*
 * in Laptop constructor MacBook
 * in Laptop constructor XPS
 * in Laptop constructor Surface
 * in Laptop constructor Thinkpad
 * for Hp in default constractor 1
 * MacBook : 2000
 * XPS : 1000
 * Surface : 500
 * Thinkpad : 100
 * hp : 1
 * 
 */