//getter and setter

class Human {
    private int age; //instance variable
    private String name;

  


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; //this differ local and instance variables if name was same
    }

}

public class Hero {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(2);
        obj.setName("Hiii");
        System.out.println(obj.getAge()); //2
        System.out.println(obj.getName()); //Hii

    }
}
