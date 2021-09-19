package ru.netology.radio;

public class Radio {
    private int station = 0;
    private int volume = 5;

    public void setStation(int stationNumber) {
        if (stationNumber >= 0 && stationNumber <= 9) {
            this.station = stationNumber;
        }
    }

    public void nextStation() {
        if (this.station == 9) {
            this.station = 0;
        }
        else {
            this.station = this.station + 1;
        }
    }

    public void prevStation() {
        if (this.station == 0) {
            this.station = 9;
        }
        else {
            this.station = this.station - 1;
        }
    }

    public void increaseVolume() {
        if (this.volume < 10) {
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