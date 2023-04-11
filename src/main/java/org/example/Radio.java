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
}

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

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio) o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getNumberOfRadio() != other.getNumberOfRadio()) {
                return false;
            } else if (this.getCurrentRadioWave() != other.getCurrentRadioWave()) {
                return false;
            } else {
                return this.getCurrentVolume() == other.getCurrentVolume();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        result = result * 59 + this.getNumberOfRadio();
        result = result * 59 + this.getCurrentRadioWave();
        result = result * 59 + this.getCurrentVolume();
        return result;
    }

    public String toString() {
        int var10000 = this.getNumberOfRadio();
        return "Radio(numberOfRadio=" + var10000 + ", currentRadioWave=" + this.getCurrentRadioWave() + ", currentVolume=" + this.getCurrentVolume() + ")";
    }
}
