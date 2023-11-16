




public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        Square square = new Square(6);
        Triangle triangle = new Triangle(4, 4, 5);

        printFigureInfo(circle);
        printFigureInfo(square);
        printFigureInfo(triangle);
    }
    private static void printFigureInfo(Figure figure) {
        System.out.println("Площадь: " + figure.getArea());
        System.out.println("Периметр: " + figure.getPerimeter());

               System.out.println();
    }
}