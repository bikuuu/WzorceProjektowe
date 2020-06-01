package adapter;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void drow() {
        System.out.println("Drow the Circle");
    }

    public double calculateCircumference() {
        return 2*Math.PI*radius;
    }
}
