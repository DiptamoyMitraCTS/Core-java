//What is enum
//we can define all the name constants

enum Status {
    // objects of status
    Running, Failed, Pending, Success;
}

public class Hero {
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Running;
        System.out.println(s); // Running
        s = Status.Failed;
        System.out.println(s.ordinal());// 1

        Status[] ss = Status.values();
        System.out.println(ss); // [LStatus;@4517d9a3

        // iterate with enhanced for loop
        for (Status j : ss) {
            System.out.println(j + " " + j.ordinal());
        }
        /*
         * Running 0
         * Failed 1
         * Pending 2
         * Success 3
         */
    }
}
