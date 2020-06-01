package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldChangeStationUp() {
        Radio radio = new Radio();

        radio.setStation(9);

        radio.setStation(radio.getStation() + 1);

        assertEquals(0, radio.getStation());

    }

    @Test
    public void shouldChangeStationDown() {
        Radio radio = new Radio();

        radio.setStation(2);

        radio.setStation(radio.getStation() - 1);
        radio.setStation(radio.getStation() - 1);
        radio.setStation(radio.getStation() - 1);

        assertEquals(9, radio.getStation());

    }
}