package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return area;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public String toString() {
        return this.getFloorCount() + " этажный коттедж площадью " + this.getArea() + " метров";
    }
}
// END
