package com.interview.sum.array;

public class DayTwo {

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0
     *
     * @param args
     */
    public static void main(String[] args) {
        //解题思路:头尾两个节点依次找中间值，如果中间值大于左值，则头值变为该中间值
        //如果中间值小于左值，则尾值为中间值
        //如果中间值小于左值，并且小于右值，则该值为最小值
        int[] arr = {4, 5, 7, 8, 10, 100, 500, 2, 3};
        int first = 0, last = arr.length - 1, mid = 0; //头索引，尾索引,中间索引
        int len = arr.length;
        mid = len / 2;
        while (true) {
            if (arr[mid] > arr[first]) {
                first = mid;
                mid = (first + last) / 2;
            } else if (arr[mid] < arr[first] && arr[mid] < arr[last]) {
                System.out.println("最小值为" + arr[mid]);
                break;
            }
        }

    }
}
