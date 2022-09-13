package ru.netology.sqr;

public class SQRService {
    public int numberSquares(int beginningRange, int endRange) {
        int number = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= beginningRange && i * i <= endRange) {
                number = number + 1;
            }
        }
        return number;
    }
}
