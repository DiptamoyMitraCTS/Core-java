//Object class equals toString hashcode

class Laptop {

    String model;
    int price;

    public String toString() {
        return "Hey";
    }
    public boolean equals(Laptop that){
        if(this.model.equals(that.model) && this.price == that.price){
            return true;
        }
        return false;
    }
}

public class Hero {

    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 60000;
        //System.out.println(obj);//Laptop@4517d9a3 //by default call toString method()

        System.out.println(obj.toString()); //if i implement toString() method then it returns that //Hey
        System.out.println(obj);//Hey

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 60000;
        /// check equal object or duplicate or not
        boolean res = obj.equals(obj1);
        // System.out.println(res);//false //by default call equals method() of object class which is in object class and it checks the reference of object not the content of object so it returns false because obj and obj1 are different object and have different reference 

        //if i implement equals method then it returns true because it checks the content of object
        System.out.println(res);//true


    }
}
