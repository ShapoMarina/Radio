package org.example;

public class Radio {
    private int numberOfRadio = 10;
    private int currentRadioWave;
    private int currentVolume;


    public Radio(int numberOfRadio) {
        this.numberOfRadio = numberOfRadio;
        this.currentRadioWave = currentRadioWave;
        this.currentVolume = currentVolume;
    }

    public Radio() {
        this.numberOfRadio = numberOfRadio;
        this.currentRadioWave = currentRadioWave;
        this.currentVolume = currentVolume;

    }

    public int getNumberOfRadio() {
        return numberOfRadio;
    }

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
        if (newCurrentRadioWave > numberOfRadio - 1) {
            return;
        }
        currentRadioWave = newCurrentRadioWave;
    }

    public void nextRadioWave() {
        if (currentRadioWave < numberOfRadio - 1) {
            currentRadioWave = currentRadioWave + 1;
        } else {
            currentRadioWave = 0;
        }
    }

    public void prevRadioWave() {
        if (currentRadioWave > 0) {
            currentRadioWave = currentRadioWave - 1;
        } else {
            currentRadioWave = numberOfRadio - 1;
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