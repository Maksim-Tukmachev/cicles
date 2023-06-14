package ru.netology.maven;

public class RestCalc {
    public int restMonth(int income, int expense, int thresold) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= thresold) {
                count++;
                money = (money - expense) - money / 3 * 2;
            } else {
                money = (money + income) - expense;
            }
        }
        return count;
    }
}
