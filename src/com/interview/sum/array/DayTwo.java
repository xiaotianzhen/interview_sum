package com.interview.sum.array;

public class DayTwo {

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0
     *
     * 二分查找时间复杂度为(O)log2N  顺序查找为(O)N
     *
     * @param args
     */
    public static void main(String[] args) {
        //解题思路:头尾两个节点依次找中间值，如果中间值大于左值，则头值变为该中间值
        //如果中间值小于左值，则尾值为中间值
        //如果中间值小于左值，并且小于右值，则该值为最小值
        int[] arr = {3, 4, 5, 1, 2};
        int first = 0, last = arr.length - 1, mid = 0; //头索引，尾索引,中间索引
        while (first < last) {
            mid = (first + last) / 2;
            if (arr[mid] == arr[first] || arr[mid] == arr[last]) {
                int min = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (i < arr.length - 1 && arr[i] > arr[i + 1]) {
                        min = arr[i + 1];
                    }
                }
                System.out.println("最小值" + min);
                break;
            }
            if (arr[mid] > arr[first]) {
                first = mid;
            } else if (arr[mid] < arr[last]) {
                last = mid;
            }
            if (last - first == 1) {
                System.out.println("最小值" + arr[last]);
                break;
            }
        }

    }
}
