//type conversion

public class Hello {
  public static void main(String[] args) {
    // byte a = 127;
    // System.out.println(a); //max store 127
    // int b = 25;
    // System.out.println(b); //25
    // a=b; //error: incompatible types: possible lossy conversion from int to byte
    // a=(byte)b; //implicitt coversion //25 //casting
    // System.out.println(a);

    // float f=5.66f;
    // int x=(int)f;
    // System.out.print(x); //5

    // byte b=127;
    // int a=b;
    // System.out.println(a); //127

    // int a=257;
    // byte k=a; //error: incompatible types: possible lossy conversion from int to
    // byte

    // byte k=(byte)a;
    // System.out.println(k); //1  // (257%256)=1 //remainder o/p //(-2^7-2^7-1)=256 (range)

    // Type promotion
    // byte a=10;
    // byte b=30;
    // int res=a*b; //value promoted to integer
    // System.out.println(res); //300

  }
}
