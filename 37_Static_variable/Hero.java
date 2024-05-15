//static variable

class Mobile{
  String brand;
  int price;
  String network;
  static String name;

  void show(){
    System.out.println(brand+" : "+price+" : "+name);
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
      obj1.show(); //Apple : 1500 : Phone
      obj2.show(); //Nokia : 15000 : Phone

  }
}
