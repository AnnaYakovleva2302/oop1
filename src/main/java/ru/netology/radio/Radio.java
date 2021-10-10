package ru.netology.radio;

public class Radio {
    private int station = 0;
    private int volume = 50;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int max) {
        this.maxStation = max - 1;
    }

    public void setStation(int stationNumber) {
        if (stationNumber >= 0 && stationNumber <= this.maxStation) {
            this.station = stationNumber;
        }
    }

    public void nextStation() {
        if (this.station == this.maxStation) {
            this.station = 0;
        }
        else {
            this.station = this.station + 1;
        }
    }

    public void prevStation() {
        if (this.station == 0) {
            this.station = this.maxStation;
        }
        else {
            this.station = this.station - 1;
        }
    }

    public void increaseVolume() {
        if (this.volume < 100) {
            this.volume = this.volume  + 1;
        }
    }
    public void decreaseVolume() {
        if (this.volume > 0) {
            this.volume = this.volume  - 1;
        }
    }

    public int getStation() {
        return this.station;
    }

    public int getVolume() {
        return this.volume;
    }
}