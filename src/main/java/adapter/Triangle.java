package adapter;

public class Triangle implements Shape {
    private double flankA;
    private double flankB;
    private double flankC;

    public Triangle(double flankA, double flankB, double flankC) {
        this.flankA = flankA;
        this.flankB = flankB;
        this.flankC = flankC;
    }

    @Override
    public void drow() {
        System.out.println("Drow the Triangle");
    }

    @Override
    public double getCircumference() {
        return flankA + flankB + flankC;
    }
}
