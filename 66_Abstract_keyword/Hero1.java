//Abstract keyword




abstract class Car{

    
    public abstract void drive(); //provide abstract idea that car should drive

    
    public  void playMusic(){
        System.out.println("Playing music");
    }

}
 class WagnoR extends  Car{

    public void drive(){
        System.out.println("WagonR is driving");
    }
 }

public class Hero1 {
    public static void main(String[] args) {
        // Car obj=new Car();
        // obj.drive();
        // obj.playMusic(); //Playing music

        WagnoR obj=new WagnoR();
        obj.drive(); //WagonR is driving
        obj.playMusic(); //Playing music




    }
}
