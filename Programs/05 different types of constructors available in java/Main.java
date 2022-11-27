class Student {
    int rollNo;
    String name;
    int age;

    //No argument constuctor
    Student() {
        System.out.println("No argument constructor called");
    }

    //Parameterized constructor
    Student(int roll, int age, String name) {
        this.rollNo = roll;
        this.name  = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

}

class Student2 {
    int rollNo ;
    String name;
    int age;

}
class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(25636, 20, "Devender");

        //Default constructor by java
        Student2 s3 = new Student2();
    }    
}