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
    @Test
    void gradeB() {
        assertEquals("B", calculator.letterGrade(85));
    }

    @Test
    void gradeC() {
        assertEquals("C", calculator.letterGrade(75));
    }

    @Test
    void gradeD() {
        assertEquals("D", calculator.letterGrade(65));
    }

    @Test
    void gradeF() {
        assertEquals("F", calculator.letterGrade(50));
    }

    @Test
    void scoreBelowZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.letterGrade(-1));
    }

    @Test
    void scoreAboveHundred() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.letterGrade(101));
    }

    @Test
    void nullScoresRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.gpa(null));
    }

    @Test
    void emptyScoresRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.gpa(new double[]{}));
    }

    @Test
    void averageAllGradeTypes() {
        assertEquals(2.0,
                calculator.gpa(new double[]{95, 85, 75, 65, 50}),
                0.000001);
    }

    @Test
    void gpaBelowZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.scholarship(-0.1, 15, false));
    }

    @Test
    void gpaAboveFour() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.scholarship(4.1, 15, false));
    }

    @Test
    void negativeCredits() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.scholarship(3.5, -1, false));
    }

    @Test
    void violationBlocksScholarship() {
        assertEquals(0,
                calculator.scholarship(3.9, 16, true));
    }

    @Test
    void highGpaInsufficientFullCredits() {
        assertEquals(70,
                calculator.scholarship(3.9, 12, false));
    }

    @Test
    void middleGpaInsufficientCredits() {
        assertEquals(50,
                calculator.scholarship(3.5, 11, false));
    }

    @Test
    void lowGpaNoScholarship() {
        assertEquals(0,
                calculator.scholarship(2.9, 16, false));
    }
    @Test
    void averageOneGrade() {
        assertEquals(4.0,
                calculator.gpa(new double[]{95}), 0.000001);
    }

    @Test
    void averageSeveralGrades() {
        assertEquals(2.5,
                calculator.gpa(new double[]{95, 85, 75, 65}),
                0.000001);
    }
}
