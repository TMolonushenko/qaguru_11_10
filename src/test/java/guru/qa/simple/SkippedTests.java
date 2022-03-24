package guru.qa.simple;

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
    @Disabled("With same reason")
    void test03() {
        assertTrue(false);
    }
}
