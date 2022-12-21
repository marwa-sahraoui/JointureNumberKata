package org.example;

public class Jointure {

    public int sum(int number){
        int result = number;

        while(number / 10 > 0){
            result += number % 10;
            number = number/10;
        }
        return result + number ;

    }
}
