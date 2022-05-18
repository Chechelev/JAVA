
package laba4;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc= new Scanner(System.in);
        System.out.println("Введите координаты точки для проверки: ");

        Point Point = new Point(sc.nextInt(), sc.nextInt());
        System.out.println("Введите радиус и координаты центра: ");
        Circle circle = new Circle(sc.nextInt(), new Point(sc.nextInt(), sc.nextInt()));

        // Circle circle = new Circle(r, new Point(x,y));
        System.out.println(circle.isPointInside(Point));

    }

}