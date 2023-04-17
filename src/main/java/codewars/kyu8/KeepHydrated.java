package codewars.kyu8;

/**
 * Exercise description:
 * https://www.codewars.com/kata/582cb0224e56e068d800003c
 * <p>
 * Nathan loves cycling.
 * Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
 * You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
 * For example:
 * time = 3 ----> litres = 1
 * time = 6.7---> litres = 3
 * time = 11.8--> litres = 5
 */

public class KeepHydrated {

    public static int countLiters(double time) {
        return (int) (Math.floor(time / 2));
    }

    public static void main(String[] args) {
        System.out.println(countLiters(5.6));
    }
}
