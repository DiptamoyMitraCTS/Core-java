

public class Hello {
  public static void main(String[] args) {
     int n=5;
     int res=0;
     //Normal method
      // if(n%2==0){
      //   res=10;   //even
      // }
      // else{
      //   res=20;  //odd
      // }
      // System.out.println(res);


      //Ternary method

      res= n%2==0?10:20;
      System.out.println(res); //20

      
  }
}
