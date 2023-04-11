package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldTest() {
        Radio wave = new Radio();

        Assertions.assertEquals(10, wave.getNumberOfRadio());
    }
}
