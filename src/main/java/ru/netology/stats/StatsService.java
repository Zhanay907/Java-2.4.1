package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        return sum;

    }

    public int avg(int[] sales) {
        int sum = sum(sales);
        return sum / sales.length;

    }

    public int NumberWithMax(int[] sales) {
        int max = sales[0];
        for (int item : sales) {
            if (item > max) {
                max = item;
            }
        }
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (max == sales[i]) {
                maxMonth = i + 1;
            }
        }

        return maxMonth;

    }

    public int NumberWithMin(int[] sales) {
        int min = sales[0];
        for (int item : sales) {
            if (item < min) {
                min = item;
            }
        }
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (min == sales[i]) {
                minMonth = i + 1;
            }
        }

        return minMonth;

    }


    public int moreThanAvg(int[] sales) {
        int monthCount = 0;

        int avg = avg(sales);
        for (int item : sales) {
            if (item > avg) {
                monthCount=monthCount+1;
            }
        }
        return monthCount;
    }

    public int lessThanAvg(int[] sales) {
        int monthCount = 0;

        int avg = avg(sales);
        for (int item : sales) {
            if (item < avg) {
                monthCount=monthCount+1;
            }
        }
        return monthCount;
    }
}

