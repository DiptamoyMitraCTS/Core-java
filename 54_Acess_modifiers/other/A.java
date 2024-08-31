package other;

public class A {
    public int marks=6; //if not public then not visible outside of the package and can't see or access on demo.java

    private int b; //its not accesed in others package.Used only same class
    protected int c=9; //work in same package , but not work in other package

    public void show(){
       System.out.println("In A show()"); 
    }
}
