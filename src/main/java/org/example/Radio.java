package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int numberOfRadio = 10;
    private int currentRadioWave;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int numberOfRadio, int currentRadioWave, int currentVolume) {
        this.numberOfRadio = numberOfRadio;
        this.currentRadioWave = currentRadioWave;
        this.currentVolume = currentVolume;
    }

    public int getNumberOfRadio() {
        return this.numberOfRadio;
    }

    public int getCurrentRadioWave() {
        return this.currentRadioWave;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setNumberOfRadio(int numberOfRadio) {
        this.numberOfRadio = numberOfRadio;
    }

    public void setCurrentRadioWave(int currentRadioWave) {
        this.currentRadioWave = currentRadioWave;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}
