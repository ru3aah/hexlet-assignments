package exercise;


// BEGIN
public class Segment {
    private Point begin;
    private Point end;


    public Segment(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBeginPoint() {
        return begin;
    }

    public Point getEndPoint() {
        return end;
    }

    public Point getMidPoint() {
        var midX = end.getX() - begin.getX();
        var midY = end.getY() - begin.getY();

        return new Point(midX, midY);
    }


}

// END
