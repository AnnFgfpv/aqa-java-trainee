package part2;

public class Rectangle implements Shape, Fillable {
    private final double sideOne;
    private final double sideTwo;
    private final String fillColor;
    private final String borderColor;

    public Rectangle(double sideOne, double sideTwo, String fillColor, String borderColor) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (sideOne + sideTwo);
    }

    @Override
    public double calculateArea() {
        return sideOne * sideTwo;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
