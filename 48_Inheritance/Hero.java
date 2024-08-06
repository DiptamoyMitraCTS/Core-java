//Inheritance

//Inheritance in Java is a fundamental object-oriented programming concept that allows one class to inherit the properties and behaviors (fields and methods) of another class. This promotes code reusability and establishes a natural hierarchy between classes.
//Inheritance helps in achieving polymorphism, where a single function can behave differently based on the object that is calling it, and it fosters a cleaner and more manageable codebase by promoting reusability and reducing redundancy.
class Calc { // super class

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

// now clients wants to add more features, so inheritance requires, we just
// inherites previous class and properties
// if delete class calc code then also run because .class file present in the
// folder
class AdvCalc extends Calc { // sub class
    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

public class Hero {
    public static void main(String[] args) {
        // Calc obj= new Calc();
        // int r1=obj.add(6, 4);
        // int r2=obj.sub(8, 2);
        // System.out.println(r1+" "+r2); //10 6

        AdvCalc obj1 = new AdvCalc();
        int r1 = obj1.add(6, 4);
        int r2 = obj1.sub(8, 2);
        int r3 = obj1.multi(7, 6);
        int r4 = obj1.div(4, 2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4); // 10 6 42 2

    }
}
