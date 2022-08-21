package ru.netology.sqr;

public class SQRService {

    public int amountOfSquares(int minLimit, int maxLimit) {
        int x = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minLimit && i *i <= maxLimit) {
                x++;
            }
        }
        return x;
    }
}