class Add{
    // public void add(int a, int b){
    //     System.out.println("int-int arguement: " + (a+b));
    // }
    // public void add(float a, float b){
    //     System.out.println("float-float arguement: " + (a+b));
    // }
    // public void add(double a, double b){
    //     System.out.println("double-double arguement: " + (a+b));
    // }


    public void add(int a){
        System.out.println("int arguement");
    }
    public void add(float a){
        System.out.println("float arguement");
    }

    public void add(float a, int b){
        System.out.println("float-int arguement");
    }
    public void add(int a, float b){
        System.out.println("int-float arguement");
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Add a = new Add();
        // normal binding will happen
        // a.add(14, 12);
        // a.add(2.0f, 3.0f);
        // a.add(10.0000023, 23.00892000);

        // implicit typecasting happens
        a.add('a'); // char->int conversion
        a.add(12L); // long->float even long->double possible
        // a.add(10.5); -> gives compile time error

        a.add(10,20f); // int float
    }
}
