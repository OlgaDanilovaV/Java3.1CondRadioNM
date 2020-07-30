package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;

//1. появляется конструктор, который может повлиять на кол-во станций. в конструкторе устанавливается поле
// громкость 1. дефолт

class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio(10, 3);

        assertEquals(3, radio.getStation());

    }

    @Test
    public void shouldChangeStationUp() {
        Radio radio = new Radio(10,10);

        radio.setStation(radio.getStation() + 1);

        assertEquals(0, radio.getStation());

    }

    @Test
    public void shouldChangeStationDown() {
        Radio radio = new Radio();

        radio.setStation(0);

        radio.setStation(radio.getStation() - 1);


        assertEquals(9, radio.getStation());

    }



    @Test
    public void shouldVolumeUp(){
        Radio radio = new Radio();

        radio.setVolume(10);

        radio.setVolume(radio.getVolume() + 1);


        assertEquals(10 , radio.getVolume());
    }

    @Test
    public void shouldVolumeDown(){
        Radio radio = new Radio();

        radio.setVolume(0);

        radio.setVolume(radio.getVolume() - 1);

        assertEquals(0 , radio.getVolume());
    }
}