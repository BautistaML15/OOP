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
        book2.settitle("Harry Potter");
        book2.setauthor("Joanne Rowling");
        book2.setprice(500.00f);

        System.out.println("Book Number  : " + book2.getnumber());
        System.out.println("Book Title   : " + book2.gettitle());
        System.out.println("Book Author  : " + book2.getauthor());
        System.out.println("Book Price   : " + book2.getprice());
        System.out.println();

    }

}

class Student {
    private int Student_Id;
    private String Name;
        
    //setters
    public void setId(int s_id) {
    this.Student_Id = s_id;
    }
        
    public void setname(String s_name) {
        this.Name = s_name;
    }
        
    //getters
    public int getId() {
        return Student_Id;
    }
        
    public String getname() {
        return Name;
    }
}

class Book {
    private int number;
    private String title;
    private String author;
    private float price;
    
    //setters
    public void setnumber(int b_num) {
        this.number = b_num;
    }
    
    public void settitle(String b_title) {
        this.title = b_title;
    }
    
    public void setauthor(String b_author) {
        this.author = b_author;
    }
    
    public void setprice(float b_price) {
        this.price = b_price;
    }
    
    //getters
    public int getnumber() {
        return number;
    }
    
    public String gettitle() {
        return title;
    }
    
    public String getauthor() {
        return author;
    }
    
    public float getprice() {
        return price;
    }
    
    
}