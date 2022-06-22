package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    Radio radio = new Radio();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setCurrentStationDefault.csv")
    public void setCurrentStationDefault(int station, int expected) {
        radio.setCurrentStation(station);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStationDefault.csv")
    public void nextStationDefault(int station, int expected) {
        radio.setCurrentStation(station);
        int actual = radio.next();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevStationDefault.csv")
    public void prevStationDefault(int station, int expected) {
        radio.setCurrentStation(station);
        int actual = radio.prev();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setCurrentVolume.csv")
    public void setCurrentVolume(int volume, int expected) {
        radio.setCurrentVolume(volume);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/upVolume.csv")
    public void upVolume(int volume, int expected) {
        radio.setCurrentVolume(volume);
        int actual = radio.upVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/downVolume.csv")
    public void downVolume(int volume, int expected) {
        radio.setCurrentVolume(volume);
        int actual = radio.downVolume();
        Assertions.assertEquals(expected, actual);
    }

    Radio radioIsChanged = new Radio(25);

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setCurrentStationIsСhanged.csv")
    public void setCurrentStationIsСhanged(int station, int expected) {
        radioIsChanged.setCurrentStation(station);
        int actual = radioIsChanged.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextStationIsСhanged.csv")
    public void nextStationIsСhanged(int station, int expected) {
        radioIsChanged.setCurrentStation(station);
        int actual = radioIsChanged.next();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevStationIsСhanged.csv")
    public void prevStationIsСhanged(int station, int expected) {
        radioIsChanged.setCurrentStation(station);
        int actual = radioIsChanged.prev();
        Assertions.assertEquals(expected, actual);
    }
}