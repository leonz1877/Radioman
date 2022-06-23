package ru.netology;

public class Radio {

    private int numberStations = 10;
    private int maxNumberStation = numberStations - 1;
    private int maxVolume = 100;
    private int currentStation;
    private int currentVolume;

    public Radio (int numberStations) {
        this.numberStations = numberStations;
        this.maxNumberStation = numberStations -1;
    }

    public Radio () {
        this.numberStations = numberStations;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation (int newCurrentStation) {
        if (newCurrentStation < 0 ) {
            newCurrentStation = 0;
        }
        if (newCurrentStation > maxNumberStation) {
            newCurrentStation = maxNumberStation;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume (int newCurrentVolume) {
        if (newCurrentVolume < 0 ) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public int next() {
        if (currentStation < maxNumberStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
        return currentStation;
    }


    public int prev() {
       if (currentStation > 0) {
           currentStation = currentStation - 1;
       }
       else {
           currentStation = maxNumberStation;
       }
       return currentStation;
    }

    public int upVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int downVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume -1;
        }
        else {
            currentVolume = 0;
        }
        return currentVolume;
    }

}
