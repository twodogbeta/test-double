package mockito;


import mock.SecurityCenterTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import stub.GradeService;
import stub.GradeServiceTest;
import stub.GradeSystem;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class MockitoTest {
    //TestStub
    @Test
    void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And1001() {
        GradeSystem gradeSystem = mock(GradeSystem.class);
        Mockito.when(gradeSystem.gradesFor(1L)).thenReturn( Arrays.asList(80.0, 90.0, 100.0));
        //Assertions.assertEquals(90.0, result);
        GradeService gradeService = new GradeService(gradeSystem);
        double result = gradeService.calculateAverageGrades(1L);
        assertEquals(90.0,result);
    }
}
