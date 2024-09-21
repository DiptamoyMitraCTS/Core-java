// WRAPPER CLASS
// 1. Wrapper class is used to convert primitive data types into objects.

public class Hero {
    public static void main(String[] args) {
        int num=7; //primitive data type
        System.out.println(num); //7
        
        Integer num1=new Integer(num); //wrapper class //boxing //converting primitive data type into object 
        System.out.println(num1); //7
        Integer num2=num ; //auto boxing  //converting primitive data type into object
        System.out.println(num2); //7

        int num3=num1.intValue(); //unboxing //converting object into primitive data type
        System.out.println(num3); //7



        String str="123"; //primitive data type
        int n=Integer.parseInt(str); //converting string into integer
        System.out.println(n*2); //246
        

    }
}
