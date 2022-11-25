package ru.netology.radioman;

public class Radio {

    private int firstRadiostation = 0;
    private int lastRadiostation = 9;

    private int radiostationAmount;

    private int currentRadiostation;

    private int minSoundVolume = 0;

    private int maxSoundVolume = 100;
    private int currentVolume;


    public Radio(int radiostationAmount) {
        lastRadiostation = radiostationAmount -1;
    }

    public Radio() {
        this.radiostationAmount = 10;
    }

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public int getRadiostationAmount() {
        return radiostationAmount;
    }

    public void setCurrentRadiostation(int newcurrentRadiostation) {
        if (newcurrentRadiostation < firstRadiostation) {
            return;
        }
        if (newcurrentRadiostation > lastRadiostation) {
            return;
        }
        currentRadiostation = newcurrentRadiostation;
    }

    public void setToFirstStation() {
        currentRadiostation = 0;
    }

    public void setToLastStation() {
        currentRadiostation = lastRadiostation;
    }

    public int nextStation() {
        currentRadiostation = currentRadiostation + 1;
        if (currentRadiostation > lastRadiostation) {
            currentRadiostation = 0;
        }
        return currentRadiostation;
    }

    public int previousStation() {
        currentRadiostation = currentRadiostation - 1;
        if (currentRadiostation < 0) {
            currentRadiostation = lastRadiostation;
        }
        return currentRadiostation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newcurrentVolume) {
        if (newcurrentVolume < 0) {
            return;
        }
        if (newcurrentVolume > 100) {
            return;
        }
        currentVolume = newcurrentVolume;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public int increaseVolume() {
        currentVolume = currentVolume + 1;

        if (currentVolume > 100) {
            currentVolume = 100;
        }
        return currentVolume;
    }

    public int lowerVolume () {
        currentVolume = currentVolume - 1;

        if (currentVolume < 0) {
            currentVolume = 0;
        }
        return currentVolume;
    }
}



