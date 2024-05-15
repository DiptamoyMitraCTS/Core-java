
public class Hero {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Navin");// mutable string //changeble

    System.out.println(sb.capacity()); // 21 Byte  //empty hole capacity 16 Byte of stringBuffer
    System.out.println(sb.length()); //5
    sb.append(" Reddy"); 
    System.out.println(sb); //Navin Reddy

    // String str=sb;//Type mismatch: cannot convert from StringBuffer to String

    String str=sb.toString(); //no error //convert stringBuffer to string
    System.out.println(str); //Navin Reddy

    sb.deleteCharAt((2));
    System.out.println(sb); //Nain Reddy

    sb.insert(2, "java");
    System.out.println(sb); //Najavain Reddy


    sb.setLength(10);
    sb.ensureCapacity(100);
    System.out.println(sb); //Najavain R

    //stringBuffer is thread-safe and stringBuilder is not thread-safe

    
  }
}
