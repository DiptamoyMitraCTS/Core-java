

public class Hello {
  public static void main(String[] args) {
    int num1=7;
    // int num2=5;
    // int res=num1+num2;  //- ,*, /, % 
    // System.out.println(res);

    num1+=1;
    num1++;
    num1=num1+1;
    System.out.println(num1); //10

    int res=++num1;  //pre increment;
     System.out.println(res);//11
    int res1=num1++; //post increment
     System.out.println(res1) ;//11
 
  }
}
