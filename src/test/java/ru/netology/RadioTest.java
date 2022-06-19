package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setCurrentStationMinimumValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationBelowMinimumValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationAboveMinimumValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationMaximumValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationBellowMaximumValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationAboveMaximumValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setCurrentVolumeMinimumValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeBellowMinimumValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeAboveMinimumValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeMaximumValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeBellowMaximumValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeAboveMaximumValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationMaximumValue () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 0;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationBellowMaximumValue () {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int expected = 9;
        int actual = radio.next();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMinimumValue () {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int expected = 9;
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationAboveMinimumValue () {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        int expected = 0;
        int actual = radio.prev();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeMaximumValue () {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.upVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeBellowMaximumValue () {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        int expected = 10;
        int actual = radio.upVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeMinimumValue () {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.downVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeAboveMinimumValue () {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int expected = 0;
        int actual = radio.downVolume();

        Assertions.assertEquals(expected, actual);
    }

}
