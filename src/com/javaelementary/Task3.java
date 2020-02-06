package com.javaelementary;

public class Task3 {

    /*
    3*. Дана строк состоящая из любых символов. Не используя стандартный метод String.toLowerCase() перевести все большие
    латинские буквы в маленькие.
    Пример:
    Input: "#1AmC"
    Output: "#1amc"
    */

    public static void main(String[] args) {
        String s = "#1AmC";
        replaceLetterToLowerCase(s);
    }

    private static void replaceLetterToLowerCase(String s) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (ch <= 'Z' && ch >= 'A') {
                ch = ch + ('a' - 'A');
            }
            s1.append((char) ch);
        }
        System.out.println(s1);
    }
}