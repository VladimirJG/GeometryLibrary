package geoUtil;

import geometricFigures.Figure;

public class HalfRectangle implements RectangleInterface {
    public HalfRectangle() {

    }

    public void halfRectangle(Figure rectangle) {
        double halfArea = rectangle.area() / 2;
        double halfPerimeter = rectangle.perimeter() / 2;
        System.out.println("halfPerimeter = " + halfPerimeter + " halfArea " + halfArea);
    }
}