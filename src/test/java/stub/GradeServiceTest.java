package stub;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    public class MockGradeSystem extends GradeSystem{

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
    }
}
