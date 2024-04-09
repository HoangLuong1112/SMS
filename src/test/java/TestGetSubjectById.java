import BUS.SubjectBUS;
import DTO.Subject;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestGetSubjectById {
    SubjectBUS subjectBUS = new SubjectBUS();
    @Test
    public void testExistedSubjectId(){
        String subjectID = "MH098";
        assertNull(subjectBUS.getSubjectByID(subjectID));
    }
}
