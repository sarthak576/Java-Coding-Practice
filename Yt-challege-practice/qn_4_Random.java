import java.util.Random;

class qn_4_Random {
    public static void main(String[] args) {
        // print 20 random values
        // 0-200
        // avoid 2 digit numbers
        Random x = new Random();
        int count = 1;

        while (count < 21) {
            int random = x.nextInt(101) + 100;
            System.err.println(count + "=" + random);
            count++;
        }

    }
    // This program uses the java.util.Random class to generate random numbers.
    // The nextInt(101) method generates a random integer between 0 and 100
    // (inclusive).
    // Adding 100 to the result shifts the range to 100-200 (inclusive).
    // The while loop continues until 20 numbers have been generated and printed.
}