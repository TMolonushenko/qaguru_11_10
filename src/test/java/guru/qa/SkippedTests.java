package guru.qa;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SkippedTests {
    @Test
    @Disabled
    void test02() {
        assertTrue(false);
    }
    @Test
    @Disabled("With same reasor")
    void test03() {
        assertTrue(false);
    }
}
