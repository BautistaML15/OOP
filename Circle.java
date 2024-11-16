class Circle extends Shape {
    private Double radius;

    public Circle(double radius, String color, Boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public Double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle radius is " + radius + ", " + super.toString();
    }
}