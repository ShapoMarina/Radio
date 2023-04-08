package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadio() {
        Radio wave = new Radio();

        wave.setCurrentRadioWave(1);

        int expected = 1;
        int actual = wave.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextRadioWave() {
        Radio wave = new Radio();
        wave.setCurrentRadioWave(0);

        wave.nextRadioWave();

        int expected = 1;
        int actual = wave.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevRadioWave() {
        Radio wave = new Radio();
        wave.setCurrentRadioWave(9);

        wave.prevRadioWave();

        int expected = 8;
        int actual = wave.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioWave() {
        Radio wave = new Radio();
        wave.setCurrentRadioWave(9);

        wave.nextRadioWave();

        int expected = 1;
        int actual = wave.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioWave() {
        Radio wave = new Radio();
        wave.setCurrentRadioWave(0);

        wave.prevRadioWave();

        int expected = 9;
        int actual = wave.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextIncreaseVolume() {
        Radio wave = new Radio();
        wave.setCurrentVolume(55);

        wave.increaseVolume();

        int expected = 56;
        int actual = wave.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToDownVolume() {
        Radio wave = new Radio();
        wave.setCurrentVolume(55);

        wave.downVolume();

        int expected = 54;
        int actual = wave.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextIncreaseVolume() {
        Radio wave = new Radio();
        wave.setCurrentVolume(100);

        wave.increaseVolume();

        int expected = 100;
        int actual = wave.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDownVolume() {
        Radio wave = new Radio();
        wave.setCurrentVolume(0);

        wave.downVolume();

        int expected = 0;
        int actual = wave.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewRadio() {
        Radio wave = new Radio();

        wave.setCurrentRadioWave(10);

        int expected = 0;
        int actual = wave.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSecondRadio() {
        Radio wave = new Radio();

        wave.setCurrentRadioWave(-5);

        int expected = 0;
        int actual = wave.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio wave = new Radio();

        wave.setCurrentVolume(30);

        int expected = 30;
        int actual = wave.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewVolume() {
        Radio wave = new Radio();

        wave.setCurrentVolume(130);

        int expected = 0;
        int actual = wave.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSecondVolume() {
        Radio wave = new Radio();

        wave.setCurrentVolume(-6);

        int expected = 0;
        int actual = wave.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
