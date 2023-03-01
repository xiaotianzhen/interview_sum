package com.interview.sum.array;


public class DayOne {

    /***
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * @param args
     */
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 3, 5, 7, 9}, {2, 4, 7, 9, 10}, {3, 5, 9, 10, 12}, {4, 6, 10, 11, 15}};
        int n = 10;
        //解题思路：从右上角，或者左上角开始找
        //1, 3, 5, 7, 9
        //2, 4, 7, 9, 10
        //3, 5, 9, 10, 12
        //4, 6, 10, 11, 15
        int row = arr.length;
        int column = arr[0].length;
        if (n > arr[row - 1][column - 1] || n < arr[0][0]) {
            System.out.println("不存在该整数");
            return;
        }
        int r = 0;
        int c = column - 1;
        boolean isExist = false;
        while (c > 0 && r < row) {
            if (n > arr[r][c]) {
                r++;
            } else if (n < arr[r][c]) {
                c--;
            } else {
                isExist = true;
                System.out.println("存在该整数" + arr[r][c]);
                System.out.println("存在该整数r "+r+" c "+c);
                break;
            }
        }
        System.out.println(isExist);
    }
}
