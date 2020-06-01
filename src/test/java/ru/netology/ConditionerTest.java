package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Conditioner;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(25);

        conditioner.setCurrentTemperature(conditioner.getCurrentTemperature() + 1);

        assertEquals(25, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(5);

        conditioner.setCurrentTemperature(conditioner.getCurrentTemperature() - 1);

        assertEquals(5, conditioner.getCurrentTemperature());
    }


}