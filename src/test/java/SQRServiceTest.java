import ru.netology.sqr.SQRService;
import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @org.junit.jupiter.api.Test
    public void test() {
        SQRService service = new SQRService();
        int beginningRange = 100;
        int endRange = 300;
        int expected = 8;
        int amount = service.numberSquares(beginningRange, endRange);
        assertEquals(expected, amount);
    }
}