package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int quantity;
    private int station;
    private int volume;

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
