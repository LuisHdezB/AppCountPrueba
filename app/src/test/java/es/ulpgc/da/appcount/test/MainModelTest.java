package es.ulpgc.da.appcount.test;

import org.junit.Before;
import org.junit.Test;

import es.ulpgc.da.appcount.mainscreen.MainModel;

import static org.junit.Assert.*;

public class MainModelTest {
    private MainModel model;

    @Before
    public void setUp() throws Exception {
        model = new MainModel();
    }

    @Test
    public void testInit() throws Exception {
        assertEquals(0, model.getContador());
    }

    @Test
    public void testIncrementOne() throws Exception {
        model.increment();
        assertEquals(1, model.getContador());
    }

    @Test
    public void testIncrementTwo() throws Exception {
        model.increment();
        model.increment();

        assertEquals(2, model.getContador());
    }

}