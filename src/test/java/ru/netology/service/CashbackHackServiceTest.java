package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cash = new CashbackHackService();

    @Test
    public void shouldTellMoreWhen1000() {

        assertEquals(246, cash.remain(2754));
    }

    @Test
    public void shouldTellLess() {

        Assertions.assertEquals(1, cash.remain(999));
    }

    @Test
    public void shouldTellAbove() {

        Assert.assertEquals(999, cash.remain(1001));
    }

    @Test
    public void shouldTellIfZero() {

        Assertions.assertEquals(1000, cash.remain(0));
    }

    @Test
    public void shouldNotTellIfBelowZero() {

        Assert.assertEquals(0, cash.remain(-50));
    }

    @Test
    public void shouldNotTellMoreWhen1T() {

        Assertions.assertEquals(0, cash.remain(1000));
    }

    @Test
    public void shouldNotTellMoreWhenAnyT() {

        Assert.assertEquals(0, cash.remain(3000));
    }
}

