package com.itheima.homework;

public class HomeWork4 {
    /**
     * 现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的最大值并打印。
     */
    public static void main(String[] args) {
        int [] array = {100,50,90,60,80,70};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <min) {
                min =array[i];
            }
        }
        System.out.println(min);
    }
}
