import java.util.Objects;

public class Rectangle {
    private double longerLine;
    private double shorterLine;

    public Rectangle() {
        longerLine = 0;
        shorterLine = 0;
    }
    public Rectangle(double longerLine, double shorterLine) {
        this.longerLine = longerLine;
        this.shorterLine = shorterLine;
    }

    public void setLongerLine(double longerLine) {
        this.longerLine = longerLine;
    }

    public void setShorterLine(double shorterLine) {
        this.shorterLine = shorterLine;
    }

    public double getShorterLine() {return this.shorterLine; }

    public double getLongerLine() {return this.longerLine; }

    public double perimeterOfTriangle() {
        return longerLine + shorterLine + Math.sqrt(Math.pow(longerLine, 2) + Math.pow(shorterLine, 2));
    }

    public double rectangleArea() {
        return longerLine * shorterLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return longerLine == rectangle.longerLine && shorterLine == rectangle.shorterLine;
    }

    public boolean similarTriangles(Rectangle r2) {
        return this.longerLine / this.shorterLine == r2.longerLine / r2.shorterLine;
    }
}
