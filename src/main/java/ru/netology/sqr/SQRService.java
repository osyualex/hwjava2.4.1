package ru.netology.sqr;

public class SQRService {
    public int calc(int LowBound, int HiBound) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= LowBound && i * i <= HiBound) {
                counter++;
            }
        }
        return counter;
    }
}
