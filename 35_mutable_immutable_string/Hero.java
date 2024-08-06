

public class Hero {
  public static void main(String[] args) {
    String name="Navin";
    name=name+ " Reddy";
    System.out.println(name); //Navin Reddy  //but we can't change the string ,only can concat


    //its create one object,because value same, then value store in heap in string constant pool area ,here s2 point same address as s1
    String s1="Navin";
    String s2="Navin";
    System.out.println(s1==s2); //true
    //mutable string--->can change  (provides StringBuffer & StringBuilder) 
    //Immutable string=remains unchange(provides normal String)
  }
}
