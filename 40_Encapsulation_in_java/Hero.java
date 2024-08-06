//Encapsulation in java
//Encapsulation helps to keep a class's internal state protected and allows for controlled access and modification through public methods.
class Human{
    private int age;
    private String name;


    public void setter(int a, String n){
        age=a;
        name=n;
    } 
    public void getter(){
        System.out.println("Age: "+age+" Name: "+name);
    }
}

public class Hero {
    public static void main(String[] args) {
        Human obj=new Human(); //create object
        // obj.age=20; //age has private access in Human
        // obj.name="Hero"; //name has private access in Human
        
        //we've to ask for getter and setter method to access private variable 
        obj.setter(20, "Hero"); //set value of private variable
        obj.getter(); //Age: 20 Name: Hero

    }
}