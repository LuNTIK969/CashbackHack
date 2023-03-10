package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cash = new CashbackHackService();

    @Test
    public void shouldTellMoreWhen1000() {

        assertEquals(cash.remain(2754), 246);
    }

    @Test
    public void shouldTellLess() {

        Assertions.assertEquals(cash.remain(999), 1);
    }

    @Test
    public void shouldTellAbove() {

        Assert.assertEquals(cash.remain(1001), 999);
    }

    @Test
    public void shouldTellIfZero() {

        Assertions.assertEquals(cash.remain(0), 1000);
    }

    @Test
    public void shouldNotTellIfBelowZero() {

        Assert.assertEquals(cash.remain(-50), 0);
    }

    @Test
    public void shouldNotTellMoreWhen1T() {

        Assertions.assertEquals(cash.remain(1000), 0);
    }

    @Test
    public void shouldNotTellMoreWhenAnyT() {

        Assert.assertEquals(cash.remain(3000), 0);
    }
}

