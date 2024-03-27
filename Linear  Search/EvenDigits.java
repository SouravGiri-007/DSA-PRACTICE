public class EvenDigits {
    public static void main(String[] args) {
        int[] numbers = {12, 345, 2, 6, 7896};
        int result = findNumbersWithEvenNumberOfDigits(numbers);
        System.out.println("Numbers with even number of digits: " + result);
    }

    public static int findNumbersWithEvenNumberOfDigits(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (countDigits(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
