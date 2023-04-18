package codewars.kyu7;

/**
 * https://www.codewars.com/kata/62c93765cef6f10030dfa92b
 * Description:
 * An infinite number of shelves are arranged one above the other in a staggered fashion.
 * The cat can jump either one or three shelves at a time: from shelf i to shelf i+1 or i+3
 * (the cat cannot climb on the shelf directly above its head)
 * Input
 * Start and finish shelf numbers (always positive integers, finish no smaller than start)
 * Task
 * Find the minimum number of jumps to go from start to finish
 * Example
 * Start 1, finish 5, then answer is 2 (1 => 4 => 5 or 1 => 2 => 5)
 */

public class CatsAndShelves {

    public static int findMinimumJumpsNeeded(int start, int finish) {
        int jumps = 0;

        while (true) {
            if (start >= finish) {
                start = finish;
                break;
            }
            if (finish > (start+2)) {
                start+=2;
            }
            start++;
            jumps++;
        }
        return jumps;
    }

    public static void main(String[] args) {
        System.out.println(findMinimumJumpsNeeded(1, 7));
    }
}
