public class Square extends Figure {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }


    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double getPrimaryProperty() {
        return 0;
    }

    @Override
    public double getArea() {
        return Math.pow(sideLength, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * sideLength;
    }


}