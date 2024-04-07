import BUS.SubjectBUS;
import DTO.Subject;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEditSubject {
    SubjectBUS subjectBUS = new SubjectBUS();
    Subject subject = new Subject("MH010", "Toán Cao Cấp", 2, 45);
    @Test
    public void testSubjectNameNotEmpty(){
        // Kiểm tra xem tên môn học có rỗng không
        String subjectName = subject.getSubjectName();
        assertNotSame("", subjectName);
    }
    @Test
    public void testCoefficientValue1Or2(){
        // Kiểm tra xem hệ số có phải là 1 hoặc 2 không
        int coefficient = subject.getCoefficient();
        assertTrue(coefficient == 1 || coefficient == 2);
    }
    @Test
    public void testNumberOfLessonValue(){
        int numberOfLession = subject.getNumberOfLesson();
        assertTrue(numberOfLession >= 30 && numberOfLession <= 60);
    }
}
