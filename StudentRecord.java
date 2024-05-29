class Student{
    // Data hiding is achieved using private access specifier
    private int rollNo;
    private String name;
    private String address;

    // setter methods
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }

    // getter methods
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

}

class StudentRecord{
    public static void main(String[] args) {
        Student s1 = new Student();
        // calling setter methods
        s1.setRollNo(21);
        s1.setName("Krish");
        s1.setAddress("Mathura");
        // nothing happens because we are setting the values and not returning anything

        // calling getter methods
        System.out.println("Roll No : " + s1.getRollNo());
        System.out.println("Name : " + s1.getName());
        System.out.println("Address : " + s1.getAddress());
        // the values set by the setter methods are returned by the getter methods
    }
}
// Note:
// - since setter methods are used to only set the values, the return type is void
// - since getter methods are used to return the values, their return type should be similar to datatype of the values they are returning 