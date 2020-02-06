package com.javaelementary;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Task2 {

    /*
    2. Написать метод.
Входящий параметр: отсортированный массив типа int который содержит отрицательные и положительные значения.
Вернуть отсортированный массив который состоит из квадратов значений.
Не использовать при этом стандартный метод sort.
Пример:
Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
*/

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        squareArray(arr);
    }

    private static int[] squareArray(int[] arr) {
        Deque<Integer> deque = new LinkedList<>();
        for (int value : arr) {
            deque.addLast(value);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (Math.abs(deque.getFirst()) >= Math.abs(deque.getLast())) {
                arr[i] = (int) Math.pow(deque.getFirst(), 2);
                deque.pollFirst();
            } else {
                arr[i] = (int) Math.pow(deque.getLast(), 2);
                deque.pollLast();
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}