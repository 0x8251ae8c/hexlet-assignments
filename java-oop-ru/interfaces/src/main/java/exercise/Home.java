package exercise;

// BEGIN
public interface Home {
    double getArea();

    default int compareTo(Home anotherHome) {
        double thisHomeArea = getArea();
        double anotherHomeArea = anotherHome.getArea();

        if (thisHomeArea == anotherHomeArea) {
            return 0;
        } else {
            return thisHomeArea > anotherHomeArea ? 1 : -1;
        }
    }
}
// END
