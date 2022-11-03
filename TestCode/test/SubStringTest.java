import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubStringTest {

    @Test
    void main() {
        SubString sub = new SubString();
        assertEquals(sub.sub("(1,2)"),"1,2");
    }
}