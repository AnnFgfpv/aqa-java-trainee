package part2;

public class Triangle implements Shape, Fillable {
    private final double sideOfTriangle;
    private final String fillColor;
    private final String borderColor;

    public Triangle(double sideOfTriangle, String fillColor, String borderColor) {
        this.sideOfTriangle = sideOfTriangle;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * sideOfTriangle;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * sideOfTriangle * sideOfTriangle;
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

