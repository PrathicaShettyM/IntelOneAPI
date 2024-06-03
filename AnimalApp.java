// method overloading

class Animal{
    // code
}

class Monkey extends Animal{
    // code
}

class AnimalMethods{
    public void m1(Animal a){
        System.out.println("Animal version.....");
    }
    public void m1(Monkey m){
        System.out.println("Monkey version.....");
    }
}

public class AnimalApp {
    public static void main(String[] args) {
        AnimalMethods am = new AnimalMethods();

        Monkey m = new Monkey(); // object of monkey class
        am.m1(m); // passing the monkey object as a parameter
        
        Animal animal = new Animal();
        am.m1(animal); // passing the animal object as a parameter
        
        // Parent obj = new Child(); // is valid
        Animal an = new Monkey();
        am.m1(an); // passing animal method to object as a parameter

    }
}

// Note:
// In the case of method overloading, compiler will bind the
// method call based on the reference type but not on the runtime
