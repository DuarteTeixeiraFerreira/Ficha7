import static org.junit.jupiter.api.Assertions.*;

import org.example.UC;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class UCTest {
    private UC uc;
    @BeforeEach
    public void setUp() {
        uc = new UC("Qualidade Software", 30);
        uc.insertMarkCU(101, 10.0);
        uc.insertMarkCU(102, 8.0);
        uc.insertMarkCU(103, 12.0);
    }
    @Test
    public void testSearchStudent() {
        assertEquals(10.0, uc.searchStudent(101));
        assertEquals(-1, uc.searchStudent(999));  // Aluno inexistente
    }
    @Test
    public void testAverageCU() {
        assertEquals(10.0, uc.averageUC(), 0.01);
    }
    @Test
    public void testIsApproved() {
        assertTrue(uc.isApproved(101));
        assertFalse(uc.isApproved(102));
    }
}
