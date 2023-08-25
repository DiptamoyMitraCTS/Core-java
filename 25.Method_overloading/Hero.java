//Method overloading
class Calc{
  public int add(int n1,int n2){
    return (n1+n2);
  }

   public int add(int n1,int n2,int n3){
    return (n1+n2+n3);
  }
}

public class Hero {
  public static void main(String[] args) {
    Calc obj=new Calc();
    int r=obj.add(50,40);
    System.out.println(r); //90

    r=obj.add(1, 2, 3);
    System.out.println(r); //6
  }
}
