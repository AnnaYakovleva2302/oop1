package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldSetAllowedStation() {
        Radio radio = new Radio(9);
        int newValue = 5;
        radio.setStation(newValue);
        int actual = radio.getStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetDisallowedStation() {
        Radio radio = new Radio(15);
        int newValue = 15;
        radio.setStation(newValue);
        int actual = radio.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNegativeStation() {
        Radio radio = new Radio();
        int newValue = -1;
        radio.setStation(newValue);
        int actual = radio.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio radio = new Radio();
        radio.nextStation();
        int actual = radio.getStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToFirstStation() {
        Radio radio = new Radio(20);
        radio.setStation(19);
        radio.nextStation();
        int actual = radio.getStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToLastStation() {
        Radio radio = new Radio(100);
        radio.prevStation();
        int actual = radio.getStation();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevStation() {
        Radio radio = new Radio();
        radio.setStation(6);
        radio.prevStation();
        int actual = radio.getStation();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int actual = radio.getVolume();
        int expected = 51;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToMaximum() {
        Radio radio = new Radio();
        for (int i = 0; i < 50; i++) {
            radio.increaseVolume();
        }
        int actual = radio.getVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int actual = radio.getVolume();
        int expected = 49;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeToMinimum() {
        Radio radio = new Radio();
        for (int i = 50; i > 0; i--) {
            radio.decreaseVolume();
        }
        int actual = radio.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}

