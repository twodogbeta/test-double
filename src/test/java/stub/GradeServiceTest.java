package stub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradeServiceTest {

/*    public static class MockGradeSystem extends GradeSystem{

       public  List<Double> gradesFor(long studentId) {
             return Arrays.asList(80.0, 90.0, 100.0);
        }
    }
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        //Assertions.assertEquals(90.0, result);
        GradeService gradeService = new GradeService(new MockGradeSystem());
        double result = gradeService.calculateAverageGrades(1L);
        assertEquals(90.0,result);
    }*/
@BeforeEach
public void setUp() {
}
@Test
void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100ByMockito() {
    GradeSystem gradeSystem = mock(GradeSystem.class);
    Mockito.when(gradeSystem.gradesFor(1L)).thenReturn( Arrays.asList(80.0, 90.0, 100.0));
    //Assertions.assertEquals(90.0, result);
    GradeService gradeService = new GradeService(gradeSystem);
    double result = gradeService.calculateAverageGrades(1L);
    assertEquals(90.0,result);
}
}
