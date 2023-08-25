/**
 * Hero
 */

class Computer {

  public void playMusic() { // behaviour
    System.out.println("Music Playing.........");
  }

  public String getMeAPen(int cost) {  //behaviour
    if(cost<=2){
      return "None";
    }
    return "Pen";
  }
}

public class Hero {

  public static void main(String[] args) { // starting of execution
      Computer obj=new Computer();
      obj.playMusic();  //Music Playing.........
     String s= obj.getMeAPen(2);
     System.out.println(s);//Pen

  }
}
