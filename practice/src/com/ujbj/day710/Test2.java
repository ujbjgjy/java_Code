package com.ujbj.day710;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = encryptionNumber(new int[]{1, 9, 8, 3});

        System.out.println(Arrays.toString(arr));
    }

    public static int[] encryptionNumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        int[] tempArr = new int[arr.length];

        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = arr[arr.length - i - 1];
        }

        return tempArr;
    }
}