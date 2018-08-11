package ru.job4j.condition;

/**
 * class Triangle
 * @author Pavel Vladi(mailto:w.h.81@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     * Calculation method property the lengths of the sides.
     *
     * Formula -(ab + ac + bc) / 2.
     * @param ab distance between points a b.
     * @param ac distance between points a c.
     * @param bc distance between points b c.
     * @return half-perimeter.
     */
    public double halfPerimiter(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     *  The area of a triangle.
     *
     * @return area, if a triangle exists or -1 if there is no triangle.
     */
    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.halfPerimiter(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt((p * (p - ab) * (p - ac) * (p - bc)));
        }
        return rsl;
    }

    /**
     * The method checks whether it is possible to construct a triangle with such side lengths.
     *
     * @param ab Length from point a b.
     * @param ac Length from point a c.
     * @param bc Length from point b c.
     * @return bool
     */
    public boolean exist(double ab, double ac, double bc) {
        if ((ab < (ac + bc)) || (ac < (ab + bc)) || (bc < (ac + ab))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);
        double ab = a.distanceTo(b);
        double ac = a.distanceTo(c);
        double bc = b.distanceTo(c);
        Triangle triangle = new Triangle(a, b, c);
        double halfP = triangle.halfPerimiter(ab, ac, bc);
        System.out.println(halfP);
    }
}
