//we have to implment all the ABSTRCT method of abstract class in the class which is extending it 


abstract class Car {

    public abstract void drive(); //provide abstract idea that car should drive

    public abstract void fly(); //this method not present in wagNor class so we have to make it abstract here and implement in updatedWagNor class 

    public void playMusic() {
        System.out.println("Playing music");
    }

}

abstract class WagnoR extends Car {

    public void drive() {
        System.out.println("WagonR is driving");
    }
}

class updatedWagNor extends WagnoR {

    public void fly() {
        System.out.println("WagonR is flying");
    }
}

public class Hero2 {

    public static void main(String[] args) {
        updatedWagNor obj = new updatedWagNor();
        obj.drive(); //WagonR is driving
        obj.playMusic(); //Playing music
        obj.fly(); //WagonR is flying
    }
}
