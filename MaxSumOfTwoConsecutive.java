public class MaxSumOfTwoConsecutive {
    public static void main(String[] args) {
        int[] numbers = { 1, 9, 13, 5, 2, 11, 7, 3 };

        int maxSum = numbers[0] + numbers[1];
        int index = 0;

        for (int i = 1; i < numbers.length - 1; i++) {
            int currentSum = numbers[i] + numbers[i + 1];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                index = i;
            }
        }

        System.out.println("Maximum sum is: " + maxSum);
        System.out.println("Two numbers are: " + numbers[index] + " and " + numbers[index + 1]);
    }
}
