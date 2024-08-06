
//static variable
class Mobile{
    String brand;
    int price;
    String network;
    static String name;

    //initialize static variables (only once initialize)
    static{
        System.out.println("Static block............");
        name="Phone";
    }

    public Mobile(){  //constructor //it runs according to no of object
        System.out.println("Constructor...........");
        brand="";
        price=200;
    }
  
    void show(){
      System.out.println(brand+" : "+price+" : "+name);
    }
  
    //static method 
    public static void show1(){
      System.out.println(name); //Phone
       //Cannot make a static reference to the non-static brand, price
    }
  
    //but we can access NON STATIC VARIABLES 
    public static void show2(Mobile obj){
      System.out.println(obj.brand); //Apple
    }
  
  
  }
  
  public class Hero {
    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        obj1.name="Smartphone";
  
        Mobile obj2=new Mobile();
        obj2.brand="Nokia";
        obj2.price=15000;
        obj2.name="Smartphone";
  
        obj1.show(); //Apple : 1500 : Smartphone
        obj2.show(); //Nokia : 15000 : Smartphone
  
        //we call static variable using classname //we are making somethings for the class member, not for the object member
        Mobile.name="Phone"; //name is static now so if change name, it'll effect both,
  
        //call normal public method
        obj1.show(); //Apple : 1500 : Phone
        obj2.show(); //Nokia : 15000 : Phone
  
  
  
        //call static method
        Mobile.show1(); //Phone
  
        //call with specific  object
        Mobile.show2(obj1); //Apple
        Mobile.show2(obj2); //Nokia
  
    }
  }
  
  
//ouput
/*Static block............
Constructor...........
Constructor...........
Apple : 1500 : Smartphone
Nokia : 15000 : Smartphone
Apple : 1500 : Phone
Nokia : 15000 : Phone
Phone
Apple
Nokia   */

//class loading happens fast so , static block initialize first, then objects and initiated and constructors are calls
//if we don't create objects then don't load class as well, so static block won't be called
//for loading we use 
// Class.forname(className: "Mobile"); //it'll load the class and call static block