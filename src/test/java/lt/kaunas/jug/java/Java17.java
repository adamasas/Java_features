package lt.kaunas.jug.java;


import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//final: the subclass can not be extended at all
//sealed: the subclass can only be extended by some permitted classes
//non-sealed: the subclass can be freely extended
public class Java17 {


    @Test
    public void testsExtensions() {
        Shape shape = new Shape();


        WeirdShape weirdShape = new WeirdShape() {
            int i = 1;
        };

        Circle circle = new Circle(4);

        System.out.println("Shape is %s".formatted(getShapeName(shape)));
        System.out.println("Shape is %s".formatted(getShapeName(circle)));
        System.out.println("Shape is %s".formatted(getShapeName(null)));
    }

    private static String getShapeName(Shape shape) {
        return switch (shape) {
            case Circle x when x.getRadius() > 3 -> "Big Circle with radius " + x.getRadius();
            case Circle x -> "Circle with radius " + x.getRadius();
            case WeirdShape x -> "Weird";
            case null -> "null";
            default -> "not a shape";

        };
    }

}

