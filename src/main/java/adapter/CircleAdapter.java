package adapter;

public class CircleAdapter implements Shape {

    Circle circle;

    public CircleAdapter(Circle circle) {
        this.circle = circle;
    }


    @Override
    public void drow() {
        circle.drow();
    }

    @Override
    public double getCircumference() {
        return circle.calculateCircumference();
    }
}
