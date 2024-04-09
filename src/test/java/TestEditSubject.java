import BUS.SubjectBUS;
import DTO.Subject;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEditSubject {
    SubjectBUS subjectBUS = new SubjectBUS();
    @Test
    public void testSubjectIdNotEmpty(){
        // Kiểm tra xem mã môn học có rỗng không
        Subject subject = new Subject("", "Toán Cao Rời Rạc2", 2, 45);
        assertFalse(subjectBUS.editSubject(subject));
    }
    @Test
    public void testFormatSubjectId(){
        // Kiểm tra 2 ký tự đầu có phải "MH" không
        Subject subject = new Subject("NH088", "Toán Cao Rời Rạc3", 2, 45);
        assertFalse(subjectBUS.editSubject(subject));
    }
    @Test
    public void testLengthSubjectId(){
        // Kiểm tra xem mã môn có đúng 5 ký tự không
        Subject subject = new Subject("MH0888", "Toán Cao Rời Rạc4", 2, 45);
        assertFalse(subjectBUS.editSubject(subject));
    }
    @Test
    public void testNumberInSubjectId(){
        // Kiểm tra xem 3 ký tự cuối có phải là số không
        Subject subject = new Subject("MHABC", "Toán Cao Rời Rạc5", 2, 45);
        assertFalse(subjectBUS.editSubject(subject));
    }
    @Test
    public void testSubjectNameNotEmpty(){
        // Kiểm tra xem tên môn học có rỗng không
        Subject subject = new Subject("MH097", "", 2, 45);
        assertFalse(subjectBUS.editSubject(subject));
    }

    @Test
    public void testSubjectNameTooLong(){
        Subject subject = new Subject("MH036", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 2, 45);
        assertFalse(subjectBUS.editSubject(subject));
    }

    @Test
    public void testExistedSubjectName(){
        Subject subject = new Subject("MH037", "Toán Cao Rời Rạc", 2, 45);
        assertFalse(subjectBUS.editSubject(subject));
    }

    @Test
    public void testCoefficientValue1Or2(){
        // Kiểm tra xem hệ số có phải là 1 hoặc 2 không
        Subject subject = new Subject("MH038", "Toán Cao Rời Rạcccc", 3, 45);
        assertFalse(subjectBUS.editSubject(subject));
    }
    @Test
    public void testNumberOfLessonValue(){
        Subject subject = new Subject("MH336", "Toán Cao Rời R", 2, 75);
        assertFalse(subjectBUS.editSubject(subject));
    }
    @Test
    public void testEditSubject(){
        Subject subject = new Subject("MH001", "Toán Cao Ka2", 2, 45);
        assertTrue(subjectBUS.editSubject(subject));
    }
}
