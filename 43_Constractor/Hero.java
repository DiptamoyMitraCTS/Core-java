//Constractor
//special method which name is similar with class name and whnen object create then automatically called the constractor
class Human {
    private int age; //instance variable
    private String name;

    public Human(){
        System.out.println("I'm constractor and I'm calling"); //I'm constractor and I'm calling
    }


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
       obj.setAge(90);
       obj.setName("Hitesh");
       System.out.println(obj.getAge()+" "+obj.getName());//90 Hitesh


    }
}
