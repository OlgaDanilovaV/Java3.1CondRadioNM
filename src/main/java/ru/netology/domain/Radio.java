package ru.netology.domain;

public class Radio {

    private int station;
    private int volume;

    public Radio() {
    }

    public Radio(int station) {
        this.station = station;
    }


    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station > 9) {
            station = 0;
        }

        if (station < 0) {
            station = 9;
        }

        this.station = station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 10){
            return;
        }
        if (volume < 0){
            return;
        }
        this.volume = volume;
    }


}
