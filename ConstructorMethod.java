// example of a zero arguement constructor
class Employee{
    String name;
    int salary;
    // zero arguement constructor
    Employee(){
        System.out.println("This is employee record...........");
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class ConstructorMethod {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.display();
    }
}
// Output will be set with default values of the datatype
// This is employee record...........
// Name: null
// Salary: 0
