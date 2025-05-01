package generics_set_map.bounded_wildcards;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String args[]) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.0));
        shapes.add(new Rectangle(1.0, 2.0));

        System.out.println("Total area: " + totalArea(shapes));

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(2.0));
        circles.add(new Circle(3.0));

        // Isso funciona porque Circle é uma subclasse de Shape.
        System.out.println("Total area: " + totalArea(circles));
    }

    // O List<? extends Shape> indica que pode receber qualquer
    // lista que seja do tipo Shape ou de qualquer subclasse de Shape.
    // Isso se chama wildcard bounded.
    public static double totalArea(List<? extends Shape> shapes) {
        double total = 0;
        for (Shape shape : shapes)
            total += shape.area();
        return total;
    }

}
