package laba4;
import java.util.Scanner;
public class Circle extends Figure {

    protected int radius;
    protected Point centerPoint;

    Circle (int radius, Point centerPoint) {
        this.radius = radius;
        this.centerPoint = centerPoint;
    }

    public boolean isPointInside(Point point) {
        if (Math.pow((point.getX() - centerPoint.getX()), 2) + Math.pow((point.getY() - centerPoint.getY()), 2) <= Math.pow(radius, 2)) {

            return true;
        }
        else {
            return false;
        }
    }
}