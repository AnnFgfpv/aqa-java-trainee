
public class Lesson5 {
    public interface Shape {
        default double calculatePerimeter() {
            return 0.0;
        }

        default double calculateArea() {
            return 0.0;
        }
        String getFillColor();
        String getBorderColor();
    }
    public static class Circle implements Shape {
        private double radius;
        private String fillColor;
        private String borderColor;

        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        public String getFillColor() {
            return fillColor;
        }

        public String getBorderColor() {
            return borderColor;
        }

        public Circle(double radius, String fillColor, String borderColor) {
            this.radius = radius;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }
    }

    public static class Rectangle implements Shape {
        private double sideOne;
        private double sideTwo;
        private String fillColor;
        private String borderColor;

        public double calculatePerimeter() {
            return (sideOne + sideTwo) * 2;
        }

        public double calculateArea() {
            return sideOne * sideTwo;
        }

        public String getFillColor() {
            return fillColor;
        }

        public String getBorderColor() {
            return borderColor;
        }

        public Rectangle(double sideOne, double sideTwo, String fillColor, String borderColor) {
            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }
    }

    public static class Triangle implements Shape {
        // Допустим треугольник равносторонний
        private double sideOfTriangle;
        private String fillColor;
        private String borderColor;
        private static final double SQRT_OF_3 = Math.sqrt(3);

        public double calculatePerimeter() {
            return sideOfTriangle * 3;
        }

        public double calculateArea() {
            return ((sideOfTriangle * sideOfTriangle) * SQRT_OF_3) / 4;
        }

        public String getFillColor() {
            return fillColor;
        }

        public String getBorderColor() {
            return borderColor;
        }

        public Triangle(double sideOfTriangle, String fillColor, String borderColor) {
            this.sideOfTriangle = sideOfTriangle;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "blue", "black");
        System.out.println("Circle:");
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Fill color: " + circle.getFillColor());
        System.out.println("Border color: " + circle.getBorderColor());

        Rectangle rectangle = new Rectangle(4.0, 6.0, "red", "green");
        System.out.println("\nRectangle:");
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Fill color: " + rectangle.getFillColor());
        System.out.println("Border color: " + rectangle.getBorderColor());

        Triangle triangle = new Triangle(3.0, "red", "blue");
        System.out.println("\nTriangle:");
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Fill color: " + triangle.getFillColor());
        System.out.println("Border color: " + triangle.getBorderColor());
    }
}