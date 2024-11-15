public class Book {
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