package ru.netology.stats;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldReturnSum() {

        assertEquals(180, service.sum(sales));
    }

    @Test
    void shouldReturnAvg() {

        assertEquals(15, service.avg(sales));
    }

    @Test
    void shouldReturnMonthWithMax() {

        assertEquals(8, service.NumberWithMax(sales));
    }

    @Test
    void shouldReturnMonthWithMin() {

        assertEquals(9, service.NumberWithMin(sales));
    }

    @Test
    void shouldReturnCountMoreThanAvg() {

        assertEquals(5, service.moreThanAvg(sales));
    }
    @Test
    void shouldReturnCountLessThanAvg() {

        assertEquals(5, service.lessThanAvg(sales));
    }

}
