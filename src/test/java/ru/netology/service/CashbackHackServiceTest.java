package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cash = new CashbackHackService();

    @Test
    public void shouldTellMoreWhen1000() {

        assertEquals(246, cash.remain(2754));
    }

    @Test
    public void shouldTellLess() {

        assertEquals(1, cash.remain(999));
    }

    @Test
    public void shouldTellAbove() {

        assertEquals(999, cash.remain(1001));
    }

    @Test
    public void shouldTellIfZero() {

        assertEquals(1000, cash.remain(0));
    }

    @Test
    public void shouldNotTellIfBelowZero() {

        assertEquals(0, cash.remain(-50));
    }

    @Test
    public void shouldNotTellMoreWhen1T() {

        assertEquals(0, cash.remain(1000));
    }

    @Test
    public void shouldNotTellMoreWhenAnyT() {

        assertEquals(0, cash.remain(3000));
    }
}

