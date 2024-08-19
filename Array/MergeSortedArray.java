package Array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums2.length;
        for (int i = 0, a = 0; i < nums1.length; i++) {
            if (nums1[i] == 0 && a < len) {
                nums1[i] = nums2[a];
                a++;
            }
        }
        Arrays.sort(nums1);
    }

}
