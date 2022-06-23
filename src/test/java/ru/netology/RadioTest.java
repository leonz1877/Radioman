package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    Radio radio = new Radio();

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "-1,0",
            "1,1",
            "9,9",
            "8,8",
            "10,9"
    })
       public void setCurrentStationDefault(int station, int expected) {
        radio.setCurrentStation(station);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "9,0",
            "8,9"
    })
    public void nextStationDefault(int station, int expected) {
        radio.setCurrentStation(station);
        int actual = radio.next();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "0,9"
    })
    public void prevStationDefault(int station, int expected) {
        radio.setCurrentStation(station);
        int actual = radio.prev();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "-1,0",
            "1,1",
            "100,100",
            "99,99",
            "101,100"
    })
    public void setCurrentVolume(int volume, int expected) {
        radio.setCurrentVolume(volume);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "99,100",
            "100,100"
    })
    public void upVolume(int volume, int expected) {
        radio.setCurrentVolume(volume);
        int actual = radio.upVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "0,0"
    })
    public void downVolume(int volume, int expected) {
        radio.setCurrentVolume(volume);
        int actual = radio.downVolume();
        Assertions.assertEquals(expected, actual);
    }

    Radio radioIsChanged = new Radio(25);

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "-1,0",
            "1,1",
            "24,24",
            "23,23",
            "25,24"
    })
    public void setCurrentStationIsСhanged(int station, int expected) {
        radioIsChanged.setCurrentStation(station);
        int actual = radioIsChanged.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "23,24",
            "24,0"
    })
    public void nextStationIsСhanged(int station, int expected) {
        radioIsChanged.setCurrentStation(station);
        int actual = radioIsChanged.next();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "0,24"
    })
    public void prevStationIsСhanged(int station, int expected) {
        radioIsChanged.setCurrentStation(station);
        int actual = radioIsChanged.prev();
        Assertions.assertEquals(expected, actual);
    }
}