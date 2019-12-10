package ru.netology.CashbackHackService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

   @Test
    void shouldNotCalculateCashbackIfAmountLowerThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actualResult = service.remain(amount);
        int expectedResult = 0;

        assertEquals(expectedResult, actualResult);

        System.out.println(actualResult);
        System.out.println(actualResult == expectedResult);
    }

    @Test
    void shouldCalculateCashbackIfAmountIsOrMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int actualResult = service.remain(amount);
        int expectedResult = 75;

        assertEquals(expectedResult, actualResult);

        System.out.println(actualResult);
        System.out.println(actualResult == expectedResult);
    }
}