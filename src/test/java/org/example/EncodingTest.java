package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EncodingTest {

    @Test
    @DisplayName("Testing Encoding Program")
    void encode() {
        assertEquals("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", Encoding.encode("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 23));
        assertEquals("B@#", Encoding.encode("A@#", 1));
    }
}