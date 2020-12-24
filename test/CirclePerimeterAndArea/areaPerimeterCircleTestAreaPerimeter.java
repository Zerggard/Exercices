package CirclePerimeterAndArea;

import org.junit.jupiter.api.Test;

class areaPerimeterCircleTestAreaPerimeter {

    @Test
    void getArea() {
        double area = AreaPerimeterCircle.getArea(7.5);
        assert (area == 176.71458676442586);
    }

    @Test
    void getPerimeter() {
        double perimeter = AreaPerimeterCircle.getPerimeter(7.5);
        assert (perimeter == 47.12388980384689);
    }
}