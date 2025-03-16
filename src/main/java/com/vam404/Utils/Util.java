package com.vam404.Utils;

import java.util.Arrays;

public class Util {

    public static int[] mergesort(int[] arr) {
        if (arr.length <= 1) return arr;

        // Find the middle index of the array
        int mid = arr.length / 2;

        // Split the array into two halves
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // Recursively sort both halves
        left = mergesort(left);
        right = mergesort(right);

        // Merge the sorted halves
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays and add the smaller one to result
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Copy remaining elements from left array if any
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Copy remaining elements from right array if any
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}
