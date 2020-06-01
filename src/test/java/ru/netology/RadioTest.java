package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldChangeStation(){
        Radio radio = new Radio();

        radio.setStation(3);

        assertEquals(3,radio.getStation());

    }
}