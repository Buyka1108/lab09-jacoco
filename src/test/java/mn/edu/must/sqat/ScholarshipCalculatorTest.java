package mn.edu.must.sqat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScholarshipCalculatorTest {

    private final ScholarshipCalculator calculator =
            new ScholarshipCalculator();

    @Test
    void gradeA() {
        assertEquals("A", calculator.letterGrade(95));
    }

    @Test
    void averageTwoGrades() {
        assertEquals(3.5,
                calculator.gpa(new double[]{95, 85}), 0.000001);
    }

    @Test
    void fullScholarship() {
        assertEquals(100,
                calculator.scholarship(3.9, 16, false));
    }

    @Test
    void seventyScholarship() {
        assertEquals(70,
                calculator.scholarship(3.5, 12, false));
    }

    @Test
    void fiftyScholarship() {
        assertEquals(50,
                calculator.scholarship(3.1, 10, false));
    }
}
