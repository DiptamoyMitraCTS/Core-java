// single and multilevel inheritance


class Calc { // super class

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

// now clients wants to add more features, so inheritance requires, we just
// inherites previous class and properties
// if delete class calc code then also run because .class file present in the folder
//its single inheritance
class AdvCalc extends Calc { // sub class
    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

//Now requirement is to build very advance scientific calculator
//we just inheritance previous class to add previous features , its multilevel inheritance
class VeryAdvCalc extends AdvCalc{
    public double power(int a, int b){
        return Math.pow(a, b);
    }
}

public class Hero {
    public static void main(String[] args) {
        VeryAdvCalc obj=new VeryAdvCalc();
        int a=obj.add(9, 9);
        int b=obj.sub(6, 2);
        int c=obj.multi(9, 9);
        double d= obj.power(2, 3);

        System.out.println(a+" "+b+" "+c+" "+d); //18 4 81 8.0
    }
}


// Calc <---AdvCalc <---VeryAdvCalc //multilevel inheritance

//Calc <---AdvCalc //single inheritance
