package com.javaelementary;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    /*
    * 1. Написать метод numJewelsInStones который принимает 2 параметра:
- String jewels: строка, каждый символ который символизирует драгоценный камень, символы уникальны
- String stones: строка, каждый символ который символизирует камень.

Строки могут состоять только из символов a..zA..Z
Метод должне вернуть количество другоценных камней в строке stones.

Пример:
jewels = "aAb"
stones = "caсAcA"
Output: 3

Explanation: в строке stones есть 3 драг. камня: a,A,A
*/

    public static void main(String[] args) {
        String jewels = "aAb";
        String stones = "caсAcA";

        numJewelsInStones(jewels, stones);
    }

    private static int numJewelsInStones(String jewels, String stones) {
        List<Character> listStones = new ArrayList<>();
        for (int i = 0; i < stones.length(); i++) {
            listStones.add(stones.charAt(i));
        }
        List<Character> listJewels = new ArrayList<>();
        for (int i = 0; i < jewels.length(); i++) {
            listJewels.add(jewels.charAt(i));
        }
        listStones.retainAll(listJewels);
        System.out.println("There are " + listStones.size() + " jewels in the stones line: " + listStones);
        return listStones.size();
    }
}