public class encapsulation {
    
    // Encapsulation is defined as the wrapping up of data and methods under a single unit. It also implements data hiding.

    public static void main(String[] args) {

        Students s1 = new Students();
        s1.setName("Anas Ali");
        System.out.println(s1.getName());
        s1.setRollNo(8);
        System.out.println();
        
    }
}


class Students {

    private String name;
    private int rollno;
    private int age;
    float percentage;
    public String password;

    public Students() {
    }
    String getName() {
        return this.name;
    }
    int getRollNo() {
        return this.rollno;
    }
    int getAge() {
        return this.age;
    }
    void setName(String name) {
        this.name = name;
    }
    void setRollNo(int rollno) {
        this.rollno = rollno;
    }
    void setAge(int age) {
        this.age = age;
    }
}