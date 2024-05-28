// local variable example
// static variable example
class Operation{
    // local variable example
    public void add(int a, int b){
        int result = a+b;
        System.out.println("The sum is: " + result);
    }
}
class Display{
    static float rateOfInterest = 9.5f;
}

public class Calculator {
    public static void main(String[] args) {
        // local variable
        Operation c = new Operation();
        c.add(10, 20);

        // static variable
        System.out.println("Static variable 1: " + Display.rateOfInterest);
        System.out.println("Static variable 2: " + new Display().rateOfInterest);
    }
}
