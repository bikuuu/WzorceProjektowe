package adapter;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        ShapreManager shapreManager = new ShapreManager(shapeList);
        Circle circle = new Circle(4);
        Square square = new Square(5);
        Triangle triangle = new Triangle(3, 4, 6);

        shapreManager.addShape(square);
        shapreManager.addShape(triangle);

        CircleAdapter circleAdapter = new CircleAdapter(circle);
        shapreManager.addShape(circleAdapter);

        shapreManager.drowAllShapes();
        shapreManager.printAllCircumference();


    }


}
