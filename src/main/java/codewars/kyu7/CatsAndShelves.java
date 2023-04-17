package codewars.kyu7;

/**
 * Exercise description:
 * https://www.codewars.com/kata/62c93765cef6f10030dfa92b
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
