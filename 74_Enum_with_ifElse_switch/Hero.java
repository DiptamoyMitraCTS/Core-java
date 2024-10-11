//Enum with if else and switch statesment

enum Status {
    // objects of status or constants
    Running, Failed, Pending, Success;
}

public class Hero {
    public static void main(String[] args) {
       Status s=Status.Running;

       //using switch case
       switch (s) {
        case Running:
            System.out.println("All Good");
            break;
        case Failed:
            System.out.println("Try again");
            break;  
        case Pending:
            System.out.println("Please wait...");
            break;      
       
        default:
            System.out.println("Success...");
            break;
       }
       
       //using if else
       if(s== Status.Running){
        System.out.println("All Good");
       }
       else if(s==Status.Failed){
        System.out.println("Try again");
       }
       else if(s==Status.Success){
        System.out.println("Success");
       }
       else{
        System.out.println("Please wait...");
       }

       
    }
}
