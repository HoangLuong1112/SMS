import BUS.SubjectBUS;
import DTO.Subject;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDeleteSubject {
    SubjectBUS subjectBUS = new SubjectBUS();

    @Test
    public void testSubjectIdNotExist() {
        // Kiểm tra xem mã môn học có rỗng không
        Subject subject = new Subject("MH123", "Toán Cao Rời Rạc2", 2, 45);
        assertFalse(subjectBUS.deleteSubject(subject));
    }
    @Test
    public void testDeleteSubject() {
        // Kiểm tra xem mã môn học có rỗng không
        Subject subject = new Subject("MH370", "English", 2, 60);
        assertTrue(subjectBUS.deleteSubject(subject));
    }
}