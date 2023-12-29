class Calc{  
  int a;
  public int add(int x, int y){
    System.out.println("In ADD");
    return x+y;
  }
}


class Hero{
  public static void main(String[] args) {
    int num1=4;
    int num2=5;
    // int res=num1+num2;
    // System.out.println(res);
    // add();  // error: cannot find symbol
    Calc ob; //just create referenc;
    ob= new Calc(); //create object
    System.out.println( ob.add(num1,num2));  //9
    

  }
}