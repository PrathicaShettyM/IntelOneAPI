// example of "Inheritence" concept 
class Person{ // Base class/ parent class / Superclass
    // instance variables
    public String name;
    public String address;
    public int age;
}

class Student extends Person{ // Derieved class / child class / subclass
    // inheriting features from person class
    // student class now has totally 5 properties
    public int marks;
    public String grade;

    // constructor
    Student(String name, String address, int age, int marks, String grade){
        System.out.println("Called during the creation of an object........");
        this.name = name;
        this.address = address;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    // normal method/ instance method
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class Inheritence{
    public static void main(String[] args) {
        // creating objects
        Student student = new Student("Ram", "Bangalore", 10, 100, "A+");  
        student.display(); // access a method using the object
    }
}