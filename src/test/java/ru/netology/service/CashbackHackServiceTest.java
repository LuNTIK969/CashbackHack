package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cash = new CashbackHackService();

    @Test
    public void shouldTellMoreWhen1000() {

        assertEquals(cash.remain(2754), 246);
    }

    @Test
    public void shouldTellLess() {

        assertEquals(cash.remain(999), 1);
    }

    @Test
    public void shouldTellAbove() {

        assertEquals(cash.remain(1001), 999);
    }

    @Test
    public void shouldTellIfZero() {

        assertEquals(cash.remain(0), 1000);
    }

    @Test
    public void shouldNotTellIfBelowZero() {

        assertEquals(cash.remain(-50), 0);
    }

    @Test
    public void shouldNotTellMoreWhen1T() {

        assertEquals(cash.remain(1000), 0);
    }

    @Test
    public void shouldNotTellMoreWhenAnyT() {

        assertEquals(cash.remain(3000), 0);
    }
}