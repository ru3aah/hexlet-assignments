package exercise;

// BEGIN
class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;


    Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return this.area + this.balconyArea;
    }

    public int getFloor() {
        return this.floor;
    }

    public String toString() {
        return "Квартира площадью " + getArea() +
                " на " + getFloor() + " этаже";
    }

    public int compareTo(Home another) {
        if ((this.getArea() == another.getArea())) {
            return 0;
        } else if ((this.getArea() > another.getArea())) {
            return 1;
        } else {
            return -1;
        }
    }
}
// END
