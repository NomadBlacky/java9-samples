package org.nomadblacky.java9.samples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnit5FeaturesTest {

    @Test
    @DisplayName("hoge")
    void hoge() {
        assertEquals("1", String.valueOf(1));
    }

    @Nested
    @DisplayName("Nested")
    class NestedTest {

        @Test
        @DisplayName("inner")
        void inner() {
            assertEquals(2, 2);
        }

        @Nested
        @DisplayName("Nested2")
        class NestedTest2 {
            @Test
            @DisplayName("inner2")
            void inner2() {
                assertEquals(3, 3);
            }
        }
    }
}
