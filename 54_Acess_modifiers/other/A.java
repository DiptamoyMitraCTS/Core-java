package other;

public class A {
    public int marks=6; //if not public then not visible outside of the package and can't see or access on demo.java

    private int b; //its not accesed in others package
    protected int c=9;

    public void show(){
       System.out.println("In A show()"); 
    }
}
