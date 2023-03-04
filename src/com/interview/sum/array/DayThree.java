package com.interview.sum.array;

public class DayThree {


    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
     * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = {9, 7, 10, 3, 6, 4, 2, 1};

        //原理：挪位填充
        //第一步找到第一个偶数
        //第二步找到第一个奇数
        //第三步将奇数保留零时值，将偶数与奇数之前的数都往后调一位（包括找到的偶数）
        //将空出来的值赋值给奇数
        int event = 0;
        int odd = 0;
        while (event < arr.length && odd < arr.length) {

            while (event < arr.length && arr[event] % 2 != 0) {
                event++;
            }
            odd = event + 1;
            while (odd < arr.length && arr[odd] % 2 == 0) {
                odd++;
            }
            if (odd >= arr.length) {
                break;
            }

            int temp = arr[odd];   //1，2，4，3，5     2，3
            for (int i = odd - 1; i >= event; i--) {
                arr[i + 1] = arr[i];
            }
            arr[event] = temp;
            event++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
