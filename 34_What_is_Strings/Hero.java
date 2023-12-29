//strings---> its actually a class

public class Hero {
  public static void main(String[] args) {
    // String name=new String(); //name reffering to string object
    // System.out.println(name); //navin@windows

    String name=new String("navin");
    // System.out.println(name); //navin
    System.out.println("Hello "+name); //Hello navin
    System.out.println(name.charAt(1)); //a 
    System.out.println(name.concat(" Mitra")); //navin Mitra
 
  }
}
