class WithoutVarArgs{
    public void add(int a, int b){
        System.out.println("Sum2: " + (a+b));
    }
    public void add(int a, int b, int c){
        System.out.println("Sum3: " + (a+b+c));
    }
    public void add(int a, int b, int c, int d){
        System.out.println("Sum4: " + (a+b+c+d));
    }
    public void add(int a, int b, int c, int d, int e){
        System.out.println("Sum5: " + (a+b+c+d+e));
    }
}

class WithVarArgs{
    public void varargsAdd(int... args){
        int sum = 0;
        for(int i : args){
            sum += i;
        }
        System.out.println("Sum using var args: " + sum);
    }
}

class TwoInOne{
    public void amethod(int a){
        System.out.println("Normal method with 1 arg");
    }
    public void amethod(int... a){
        System.out.println("Method with variable no. of arg");
    }
}

public class VarArgs {
    public static void main(String[] args) {
        WithoutVarArgs wovr = new WithoutVarArgs();
        WithVarArgs wvr = new WithVarArgs();

        // without varagrs
        wovr.add(10, 20);
        wovr.add(10, 20, 30);
        wovr.add(10, 20, 30, 40);
        wovr.add(10, 20, 30, 40, 50);
        System.out.println();

        // with var args
        wvr.varargsAdd(10);
        wvr.varargsAdd(10, 20);
        wvr.varargsAdd(10, 20, 30);
        wvr.varargsAdd(10, 20, 30, 40);
        wvr.varargsAdd(10, 20, 30, 40, 50);

        System.out.println();

        // VERY VERY IMPORTANT
        TwoInOne n1 = new TwoInOne();
        n1.amethod();
        n1.amethod(10); // in this case compiler goes for exact match
        n1.amethod(10, 20); // this goes for var args
        
    }
}
// In case of var-args all the arguements should be of the same datatype
// We can call var-args by passing arguements from 0....n
