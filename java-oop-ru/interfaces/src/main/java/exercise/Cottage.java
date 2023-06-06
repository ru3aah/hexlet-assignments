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

    @java.lang.Override
    public java.lang.String toString() {
        return getFloorCount() + " этажный коттедж площадью "
                + getArea() + " метров.";
    }

    public int compareTo(Home another) {
        switch (this.getArea() - another.getArea()) {
            case > 0 : return 1;
            case = 0 : return 0;
            case < 0 : return -1;
        }
    }
}
// END
