import BUS.SubjectBUS;
import DTO.Subject;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestAddSubject {
    SubjectBUS subjectBUS = new SubjectBUS();
    Subject subject = new Subject("MH015", "Toán Cao Cấp", 2, 45);
    @Test
    public void testSubjectIdNotExist(){
        // Kiểm tra xem id môn học có tồn tại trong DB hay chưa
        ArrayList<String> allSubjectId = new ArrayList<>();
        for (Subject s : subjectBUS.getAllSubjects()) {
            allSubjectId.add(s.getSubjectID());
        }
        assertFalse(allSubjectId.contains(subject.getSubjectID()));
    }
    @Test
    public void testSubjectIdNotEmpty(){
        // Kiểm tra xem mã môn học có rỗng không
        assertNotSame("", subject.getSubjectID());
    }
    @Test
    public void testFormatSubjectId(){
        // Kiểm tra 2 ký tự đầu có phải "MH" không
        String subjectId = subject.getSubjectID();
        assertEquals("MH",subjectId.substring(0,2));
    }
    @Test
    public void testLengthSubjectId(){
        // Kiểm tra xem mã môn có đúng 5 ký tự không
        String subjectId = subject.getSubjectID();
        assertEquals(5, subjectId.length());
    }
    @Test
    public void testNumberInSubjectId(){
        // Kiểm tra xem 3 ký tự cuối có phải là số không
        String subjectId = subject.getSubjectID();
        assertEquals(true, subjectId.substring(2).matches("\\d+"));
    }
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
//    @Test
//    public void testAddSubject(){
//        subjectBUS.addSubject(subject);
//        assertTrue(subjectBUS.getAllSubjects().contains(subject));
//    }
}
