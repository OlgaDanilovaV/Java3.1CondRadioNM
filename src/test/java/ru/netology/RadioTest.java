package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;


class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio(10,11,30);

        assertEquals(0, radio.getStation());

    }

    @Test
    public void shouldChangeStationUp() {
        Radio radio = new Radio(10,10,100);

        radio.setStation(radio.getStation() + 1);

        assertEquals(0, radio.getStation());

    }

    @Test
    public void shouldChangeStationDown() {
        Radio radio = new Radio(10, 0,18);

        radio.setStation(radio.getStation() - 1);

        assertEquals(10, radio.getStation());

    }



    @Test
    public void shouldVolumeUp(){
        Radio radio = new Radio(7,4,100);
        radio.setVolume(radio.getVolume() + 1);


        assertEquals(100 , radio.getVolume());
    }

    @Test
    public void shouldVolumeDown(){
        Radio radio = new Radio(10,5,0);

        radio.setVolume(radio.getVolume() - 1);

        assertEquals(0 , radio.getVolume());
    }

    @Test
    public void everythingOk(){
        Radio radio = new Radio(1,3,100);

        radio.setVolume(radio.getVolume() + 1);

        assertEquals(0, radio.getStation());
        assertEquals(100 , radio.getVolume());
    }
}