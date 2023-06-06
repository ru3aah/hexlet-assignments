package exercise;

// BEGIN
class Cottage implements Home {
    private double area;
    private int floorCount;

   Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return this.area;
    }

    public int getFloorCount() {
        return this.floorCount;
    }

    public String toString() {
        return getFloorCount() + " этажный коттедж площадью "
                + getArea() + " метров";
    }

    public int compareTo(Home another) {
        if ((this.getArea() == another.getArea())) {
            return 0;
        } else if ((this.getArea() > another.getArea())) {
            return 1;
        } else {
            return 0;
        }
    }

}
// END
