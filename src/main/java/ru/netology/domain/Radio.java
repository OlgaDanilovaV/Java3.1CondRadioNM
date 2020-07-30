package ru.netology.domain;

public class Radio {

    private int quantity;
    private int station;
    private int volume;

    public Radio() {
    }

    public Radio(int quantity, int station) {
        this.quantity = quantity;
        this.station = station;

    }

    public Radio(int quantity, int station, int volume) {
        this.quantity = quantity;
        this.station = station;
        this.volume = volume;
    }


    public int getStation() {
        if (station > quantity){
            return 0;
        }

        return station;
    }

    public void setStation(int station) {
        if (station > quantity) {
            station = 0;
        }

        if (station < 0) {
            station = quantity;
        }

        this.station = station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 100){
            return;
        }
        if (volume < 0){
            return;
        }
        this.volume = volume;
    }


}
