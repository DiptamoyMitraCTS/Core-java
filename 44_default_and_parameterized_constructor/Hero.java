//default and parametreized constructor
class Human {
    private int age;
    private String name;

    // default (if not written default, it automatically create internally a default constructor)
    public Human() {
        System.out.println("I am a default constructor");
    }

    // parameterized
    public Human(int a, String name) {
        System.out.println("I am parameterized constructor");
        age = a;
        this.name = name;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

public class Hero {
    public static void main(String[] args) {
        //default called
        Human obj = new Human();
        obj.setAge(10);
        obj.setName("Dipto");
        System.out.println(obj.getAge()+" "+obj.getName()); //10 Dipto

        //parameterized called
        Human obj1 = new Human(18, "kaberi");
        System.out.println(obj1.getAge()+" "+obj1.getName()); //18 kaberi
    }
}
