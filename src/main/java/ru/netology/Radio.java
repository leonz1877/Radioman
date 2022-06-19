package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation (int newCurrentStation) {
        if (newCurrentStation < 0 ) {
            newCurrentStation = 0;
        }
        if (newCurrentStation > 9) {
            newCurrentStation = 9;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume (int newCurrentVolume) {
        if (newCurrentVolume < 0 ) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
    }

    public int next() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else currentStation = 0;
        return currentStation;
    }


    public int prev() {
       if (currentStation > 0) {
           currentStation = currentStation - 1;
       }
       else currentStation = 9;
       return currentStation;
    }

    public int upVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        else currentVolume = 10;
        return currentVolume;
    }

    public int downVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume -1;
        }
        else currentVolume = 0;
        return currentVolume;
    }

}
