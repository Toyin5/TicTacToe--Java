import java.util.Random;

/**
 * Computer
 */
class Computer {
    public int move() {
        Random rand = new Random();
        int minRange = 1, maxRange= 9;
        int value = rand.nextInt(maxRange - minRange) + minRange;
        return value;
    }
}