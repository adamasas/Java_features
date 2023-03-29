package lt.kaunas.jug.java;

public final class Circle extends Shape {
    private final int radius;

    Circle(int radius){
        this.radius =radius;
    }

    public int getRadius(){
        return radius;
    }
}
