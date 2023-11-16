public class Triangle extends Figure {
    private double A;
    private double B;
    private double C;

    public Triangle(double sideA, double sideB, double sideC) {
        this.A = sideA;
        this.B = sideB;
        this.C = sideC;
    }

    @Override
    public double getPrimaryProperty() {
        return A;
    }

    @Override
    public double getArea() {

        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - A) * (s - B) * (s - C));
    }

    @Override
    public double getPerimeter() {
        return A + B + C;
    }


}