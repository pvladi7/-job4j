package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;
/**
 * Test for class Triangle
 */
public class TriangleTest {
    Point a = new Point(0, 0);
    Point b = new Point(0, 2);
    Point c = new Point(2, 0);
    Triangle triangle = new Triangle(a, b, c);

    @Test
    public void halfPerimeter() {
        double ab = a.distanceTo(b);
        double ac = a.distanceTo(c);
        double bc = b.distanceTo(c);
        double result = triangle.halfPerimiter(ab, ac, bc);
        double expected = 3.4;
        assertThat(result, closeTo(expected, 0.1));
    }
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);
        double result = triangle.area();
        double expected = 2D;
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void checkExistTriangle() {
        double ab = a.distanceTo(b);
        double ac = a.distanceTo(c);
        double bc = b.distanceTo(c);
        boolean result = triangle.exist(ab, ac, bc);
        boolean expected = true;
        assertEquals(result, expected);
    }
}
