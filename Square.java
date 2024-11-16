class Square extends Rectangle {
    private Double side;

    public Square(double side, String color, Boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
        setLength(side);
        setWidth(side);
    }

    public double getSide() {
        return side;
    }

    @Override
    public Double getArea() {
        return side * side;
    }

    @Override
    public Double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square side is " + side + ", " + super.toString();
    }
}