//&& AND   || OR  ! NOT

public class Hello {
  public static void main(String[] args) {
    /*
     * AND
     * T T ->T
     * F F->F
     * T F->F
     * F T->F
     * 
     * OR
     * T T->T
     * T F->T
     * F T->T
     * F F->F
     * 
     * NOT
     * F->T
     * 
     */


     int x=7;
     int y=5;
     int a=5;
     int b=9;

    //  boolean res= x>y && a>b; 
    //  System.out.println(res);  //false
    // boolean res= x>y || a>b; 
    //  System.out.println(res);  //TRUE
    boolean res= x<y || a<b || a>1 || x>1;
    System.out.println(res); //true


  }
}
