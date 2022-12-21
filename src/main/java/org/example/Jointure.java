package org.example;

public class Jointure {

    public int sum(int number) {
        int result = number;

        while (number / 10 > 0) {
            result += number % 10;
            number = number / 10;
        }
        
        return result + number;
    }

    public int findJointure(int s1, int s2) {

        while (s1 != s2) {
            if (s1 < s2) {
                s1 = sum(s1);
            }
            if (s2 < s1) {
                s2 = sum(s2);
            }
        }

        return s1;
    }
}
