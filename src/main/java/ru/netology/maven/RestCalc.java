package ru.netology.maven;

public class RestCalc {
    public int restMonth(int income, int expense, int thresold) {
        int money = 0;
        int monthRest = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= thresold) {
                money -= expense;
                money /= 3;
                monthRest++;
            } else {
                money += income;
                money -= expense;
            }
        }
        return monthRest;
    }
}
