import BUS.SubjectBUS;
import DTO.Subject;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestAddSubject {
    SubjectBUS subjectBUS = new SubjectBUS();

    @Test
    public void testExistedSubjectId(){
        Subject subject = new Subject("MH001", "Toán Cao Rời Rạc1", 2, 45);
        assertFalse(subjectBUS.addSubject(subject));
    }
    @Test
    public void testSubjectIdNotEmpty(){
        Subject subject = new Subject("", "Toán Cao Rời Rạc2", 2, 45);
        assertFalse(subjectBUS.addSubject(subject));
    }
    @Test
    public void testFormatSubjectId(){
        Subject subject = new Subject("NH088", "Toán Cao Rời Rạc3", 2, 45);
        assertFalse(subjectBUS.addSubject(subject));
    }
    @Test
    public void testLengthSubjectId(){
        Subject subject = new Subject("MH0888", "Toán Cao Rời Rạc4", 2, 45);
        assertFalse(subjectBUS.addSubject(subject));
    }
    @Test
    public void testNumberInSubjectId(){
        Subject subject = new Subject("MHABC", "Toán Cao Rời Rạc5", 2, 45);
        assertFalse(subjectBUS.addSubject(subject));
    }
    @Test
    public void testSubjectNameNotEmpty(){
        Subject subject = new Subject("MH097", "", 2, 45);
        assertFalse(subjectBUS.addSubject(subject));
    }

    @Test
    public void testSubjectNameTooLong(){
        Subject subject = new Subject("MH036", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 2, 45);
        assertFalse(subjectBUS.addSubject(subject));
    }

    @Test
    public void testExistedSubjectName(){
        // Kiểm tra xem mã môn học có rỗng không
        Subject subject = new Subject("MH037", "Toán Cao Rời Rạc", 2, 45);
        assertFalse(subjectBUS.addSubject(subject));
    }

    @Test
    public void testCoefficientValue1Or2(){
        // Kiểm tra xem hệ số có phải là 1 hoặc 2 không
        Subject subject = new Subject("MH038", "Toán Cao Rời Rạcccc", 3, 45);
        assertFalse(subjectBUS.addSubject(subject));
    }
    @Test
    public void testNumberOfLessonValue(){
<<<<<<< Updated upstream
        Subject subject = new Subject("MH115", "Toán Cao Rời Rạaa", 2, 75);
        assertFalse(subjectBUS.addSubject(subject));
    }
    @Test
    public void testAddSubject(){
        Subject subject = new Subject("MH057", "Toán Cao Rã Rời Rạcca331", 2, 45);
        assertTrue(subjectBUS.addSubject(subject));
=======
        // Kiểm tra số tiết
        int numberOfLession = subject.getNumberOfLesson();
        assertTrue(numberOfLession >= 30 && numberOfLession <= 60);
>>>>>>> Stashed changes
    }
}
