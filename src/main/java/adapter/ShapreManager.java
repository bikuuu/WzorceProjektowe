package adapter;

import java.util.List;
import java.util.stream.Collectors;

public class ShapreManager {

    private List<Shape> shapeList;

    public ShapreManager(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public void addShape(Shape shape) {
        shapeList.add(shape);
    }

    public void drowAllShapes() {
        for (Shape shape : shapeList) {
            shape.drow();
        }
    }

    public void printAllCircumference() {
        for (Shape shape : shapeList) {
            System.out.println(shape.getClass().getSimpleName() + " Circumference: " + shape.getCircumference());
        }
    }
}
