import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testNormalTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NORMAL, type);

    }

    @Test
    public void testIsoscelesTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);

    }

        @Test
    public void testEquilateralTriangle() {

        // Arrange
        float a = 2;
        float b = 2;
        float c = 2;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type);

    }

}
