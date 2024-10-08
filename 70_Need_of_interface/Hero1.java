//solution

abstract class Computer{
    public abstract void code();
}
class Laptop extends Computer{
    public void code(){
        System.out.println("Coding , compilile..");
    }
}
class Desktop extends Computer{
    public void code(){
        System.out.println("faster....Coding , compilile..");
    }
}

class Developer{
    public void develop(Computer cp){
        System.out.println("Developing app..");
        cp.code(); //faster....Coding , compilile..
        //codeing..compile
    }
}

public class Hero1 {
    public static void main(String[] args) {
        Computer hp=new Laptop();
        Computer dell=new Desktop();

        Developer navin=new Developer();
        navin.develop(dell); //Developing app.. //faster....Coding , compilile..
        navin.develop(hp); //Developing app.. //Coding , compilile..

        


    }
}
