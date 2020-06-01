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
        conditioner.setCurrentTemperature(23);

        conditioner.setCurrentTemperature(conditioner.getCurrentTemperature() + 1);
        conditioner.setCurrentTemperature(conditioner.getCurrentTemperature() + 1);
        conditioner.setCurrentTemperature(conditioner.getCurrentTemperature() + 1);

        assertEquals(25, conditioner.getMaxTemperature());
        assertEquals(25, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(7);

        conditioner.setCurrentTemperature(conditioner.getCurrentTemperature() - 1);
        conditioner.setCurrentTemperature(conditioner.getCurrentTemperature() - 1);
        conditioner.setCurrentTemperature(conditioner.getCurrentTemperature() - 1);

        assertEquals(5, conditioner.getMinTemperature());
        assertEquals(5, conditioner.getCurrentTemperature());
    }


}