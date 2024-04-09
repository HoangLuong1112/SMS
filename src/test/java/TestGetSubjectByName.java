import BUS.SubjectBUS;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class TestGetSubjectByName {
    SubjectBUS subjectBUS = new SubjectBUS();
    @Test
    public void testExistedSubjectName(){
        String subjectName = "Toán Đại Số";
        assertNull(subjectBUS.getSubjectByName(subjectName));
    }
}
