import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testRightTriangleA() {
        assertEquals("Right", Triangle.classifyTriangle(3, 4, 5));
    }

    @Test
    public void testRightTriangleB() {
        assertEquals("Right", Triangle.classifyTriangle(5, 12, 13));
    }

    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", Triangle.classifyTriangle(1, 1, 1));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", Triangle.classifyTriangle(2, 2, 3));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene", Triangle.classifyTriangle(7, 8, 9));
    }

    @Test
    public void testInvalidInput() {
        assertEquals("InvalidInput", Triangle.classifyTriangle(201, 5, 5));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", Triangle.classifyTriangle(1, 2, 3));
    }

    public static void main(String[] args) {
        System.out.println("Running unit tests...");
        org.junit.runner.JUnitCore.main("TriangleTest");
    }
}
