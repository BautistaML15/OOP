abstract class Shape {
    protected String color;
    protected Boolean filled;

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public Boolean isFilled() {
        return filled;
    }

    abstract Double getArea();

    abstract Double getPerimeter();

    @Override
    public String toString() {
        return "Shape color is " + color + " and " + (filled ? "filled" : "not filled") + ".";
    }
}
