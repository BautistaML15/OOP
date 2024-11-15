public class EncapsulationSample{
    public static void main(String[] args){

        Student student1 = new Student ();
        student1.setId(1234);
        student1.setname("Student_1");

        System.out.println("Student Id: " + student1.getId());
        System.out.println("Student Name: " + student1.getname());
        System.out.println();


        Book book1 = new Book ();
        book1.setnumber(1);
        book1.settitle("Holy Bible");
        book1.setprice(500.00f);

        System.out.println("Book Number: " + book1.getnumber());
        System.out.println("Book Title : " + book1.gettitle());
        System.out.println("Book Price : " + book1.getprice());
        System.out.println();


        Book book2 = new Book ();
        book2.setnumber(2);
        book2.settitle("El Fili Busterismo");
        book2.setauthor("Dr. Jose Rizal");
        book2.setprice(500.00f);

        System.out.println("Book Number  : " + book2.getnumber());
        System.out.println("Book Title   : " + book2.gettitle());
        System.out.println("Book Author  : " + book2.getauthor());
        System.out.println("Book Price   : " + book2.getprice());
        System.out.println();


    }
}