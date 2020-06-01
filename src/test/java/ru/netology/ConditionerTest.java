package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Conditioner;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setName("Dyson");
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(25);

        conditioner.setCurrentTemperature(conditioner.getCurrentTemperature() + 1);
        conditioner.setCurrentTemperature(conditioner.getCurrentTemperature() + 1);
        conditioner.setCurrentTemperature(conditioner.getCurrentTemperature() + 1);

        assertEquals("Dyson", conditioner.getName());
        assertEquals(25, conditioner.getMaxTemperature());
        assertEquals(5, conditioner.getMinTemperature());
        assertEquals(25, conditioner.getCurrentTemperature());
    }



    @Test
    public void shouldGetMaxTemperature() {

        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(10);
        conditioner.setCurrentTemperature(conditioner.getCurrentTemperature() + 1);
        assertEquals(10, conditioner.getCurrentTemperature());
    }

}