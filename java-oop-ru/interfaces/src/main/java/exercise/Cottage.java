package exercise;

// BEGIN
class Cottage implements Home {
    private final double area;
    private final int floorCount;

    Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return area;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public int compareTo(Home anotherHome) {
        Double area1 = this.getArea();
        Double area2 = anotherHome.getArea();

        return area1.compareTo(area2);
    }

    public String toString() {
        return getFloorCount() + " этажный коттедж площадью " + getArea() + " метров";
    }
}
// END
