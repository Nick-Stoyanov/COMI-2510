package week_2_project.dashboard;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week_2_project.gauge.Gauge;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AutomobileTest
{

    @BeforeEach
    void setUp()
    {
    }

    @AfterEach
    void tearDown()
    {
    }

    @Test
    void getInternalCounter()
    {
    }

    /**
     * Test the setMpg method by passing 10 as test value
     */
    @Test
    void setMpg()
    {
        Automobile automobile = new Automobile("car");
        automobile.setMpg(10);

        assertEquals(10, automobile.getMpg());
    }

    @Test
    void getGaugeList()
    {
        Automobile automobile = new Automobile("car");
        assertTrue(automobile.getGaugeList() instanceof ArrayList<Gauge>);
    }

    @Test
    void getFuelGauge()
    {

        Automobile automobile = new Automobile("car");

        assertTrue(automobile.getFuelGauge() instanceof Gauge);

    }


    @Test
    void getOilGauge()
    {

        Automobile automobile = new Automobile("car");

        assertTrue(automobile.getOilGauge() instanceof Gauge);
    }

    @Test
    void getTireGauge()
    {
        Automobile automobile = new Automobile("car");

        assertTrue(automobile.getTireGauge() instanceof Gauge);


    }

    @Test
    void setFuelGauge()
    {
        Automobile automobile = new Automobile("car");

        automobile.setFuelGauge(10, 10);

        assertEquals(10, automobile.getFuelGauge().getCurrentAmount());
        assertEquals(10, automobile.getFuelGauge().getMaximumAmount());

    }

    @Test
    void setOilGauge()
    {
        Automobile automobile = new Automobile("car");
        automobile.setOilGauge(10, 10);

        assertEquals(10, automobile.getOilGauge().getCurrentAmount());
        assertEquals(10, automobile.getOilGauge().getMaximumAmount());
    }

    @Test
    void setTireGauge()
    {
        Automobile automobile = new Automobile("car");
        automobile.setTireGauge(10, 10);

        assertEquals(10, automobile.getTireGauge().getCurrentAmount());
        assertEquals(10, automobile.getTireGauge().getMaximumAmount());
    }

    @Test
    void getKey()
    {
        Automobile automobile = new Automobile("car");
        assertTrue(automobile.getKey() > -1);

    }

    @Test
    void setKey()
    {
        Automobile automobile = new Automobile("car");
    }

    @Test
    void getMpg()
    {
        Automobile automobile = new Automobile("car");
    }

    @Test
    void getName()
    {
        Automobile automobile = new Automobile("car");
        assertTrue(automobile.getName()instanceof String);
    }

    @Test
    void setName()
    {
        Automobile automobile = new Automobile("car");
        automobile.setName("test");
        assert(automobile.getName().equals("test"));
    }
}