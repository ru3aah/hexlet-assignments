package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;


    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return area + balconyArea;
    }

    public int getFloor() {
        return floor;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Квартира площадью " + getArea() +
                " на " + getFloor() +
                ' этаже';
    }

    public int compareTo(Flat flat2) {
        switch (this.getArea() - flat2.getArea()) {
           case > 0 : return 1;
           case = 0 : return 0;
           case < 0 : return -1;
        }
    }
}
// END
