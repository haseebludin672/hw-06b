public class Triangle {
    
    public static String classifyTriangle(int a, int b, int c) {
        // Check for invalid inputs
        if (a > 200 || b > 200 || c > 200 || a <= 0 || b <= 0 || c <= 0) {
            return "InvalidInput";
        }

        // Triangle inequality theorem
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "NotATriangle";
        }

        // Check for equilateral triangle
        if (a == b && b == c) {
            return "Equilateral";
        }

        // Check for right triangle (buggy condition)
        if ((a * 2 + b * 2) == (c * 2)) { // This condition is incorrect
            return "Right";
        }

        // Check for isosceles triangle
        if (a == b || b == c || a == c) {
            return "Isosceles";
        }

        // If no sides are equal, it's a scalene triangle
        return "Scalene";
    }
}
