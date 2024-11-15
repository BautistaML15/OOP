public class Polymorphism {
    public static void main(String[] args) {

        Student student1 = new Student ("Juan", "Batangas PH", "BSIT", 2);
        System.out.println("Student Name   : " + student1.getName());
        System.out.println("Student Address: " + student1.getAddress());
        System.out.println("Student Program: " + student1.getProgram());
        System.out.println("Student Year   : " + student1.getYear());
        System.out.println(student1.toString());
        System.out.println();

        Staff staff1 = new Staff ("Pedro", "Batangas PH", "Batangas State University", 1500.00);
        System.out.println("Staff Name   : " + staff1.getName());
        System.out.println("Staff Address: " + staff1.getAddress());
        System.out.println("Staff School : " + staff1.getSchool());
        System.out.println("Staff Salary : " + staff1.getSalary());
        System.out.println(staff1.toString());

    }
}