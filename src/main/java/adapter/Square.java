package adapter;

public class Square implements Shape {

    private double flank;

    public Square(double flank) {
        this.flank = flank;
    }

    @Override
    public void drow() {
        System.out.println("Drow the Square");
    }

    @Override
    public double getCircumference() {
        return 4 * flank;
    }
}
