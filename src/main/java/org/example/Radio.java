package org.example;

public class Radio {
    public int currentRadioWave;
    public int currentVolume;

    public int getCurrentRadioWave() {
        return currentRadioWave;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentRadioWave(int newCurrentRadioWave) {
        if (newCurrentRadioWave < 0) {
            return;
        }
        if (newCurrentRadioWave > 9) {
            return;
        }
        currentRadioWave = newCurrentRadioWave;
    }

    public void nextRadioWave() {
        if (currentRadioWave < 9) {
            currentRadioWave = currentRadioWave + 1;
        } else {
            currentRadioWave = 1;
        }
    }

    public void prevRadioWave() {
        if (currentRadioWave > 0) {
            currentRadioWave = currentRadioWave - 1;
        } else {
            currentRadioWave = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}