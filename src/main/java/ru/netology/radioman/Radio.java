package ru.netology.radioman;

public class Radio {

    private int firstRadiostation = 0;
    private int lastRadiostation = 9;
    private int currentRadiostation;

    private int minSoundVolume = 0;

    private int maxSoundVolume = 10;
    private int currentVolume;

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }

    public void setCurrentRadiostation(int newcurrentRadiostation) {
        if (newcurrentRadiostation < 0) {
            return;
        }
        if (newcurrentRadiostation > 9) {
            return;
        }
        currentRadiostation = newcurrentRadiostation;
    }

    public void setToFirstStation() {
        currentRadiostation = 0;
    }

    public void setToLastStation() {
        currentRadiostation = 9;
    }

    public int nextStation() {
        currentRadiostation = currentRadiostation + 1;
        if (currentRadiostation > 9) {
            currentRadiostation = 0;
        }
        return currentRadiostation;
    }

    public int previousStation() {
        currentRadiostation = currentRadiostation - 1;
        if (currentRadiostation < 0) {
            currentRadiostation = 9;
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
        if (newcurrentVolume > 10) {
            return;
        }
        currentVolume = newcurrentVolume;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        return currentVolume;
    }

    public int lowerVolume() {
        currentVolume = currentVolume - 1;

        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        return currentVolume;
    }
}