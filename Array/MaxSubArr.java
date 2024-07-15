package Array;

public class MaxSubArr {
    public static void main(String[] args) {
        int[] arr = { -1, 3, 4, -2 };

        int max = maxSum(arr);
        System.out.println(max);
    }

    public static int maxSum(int[] arr) {
        int maxSum = arr[0];
        int sum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (sum >= 0) {
                sum += arr[i];
            } else {
                sum = arr[i];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;

    }
}
