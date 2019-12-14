package ru.netology.CashbackHackService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

   @Test
    void shouldNotCalculateCashbackIfAmountLowerThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actualResult = service.remain(amount);
        int expectedResult = 200;

        assertEquals(expectedResult, actualResult);

        }

    @Test
    void shouldCalculateCashbackIfAmountIsOrMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actualResult = service.remain(amount);
        int expectedResult = 0;

        assertEquals(expectedResult, actualResult);

      }
}