package com.thinkgem.jeesite.test;

import java.text.ParseException;

public class CountTest {

    public static void main(String[] args) throws ParseException {
        String str = "asdas123123qweqwAAA";
        int szCount = 0;// 数字数量
        int zmCount = 0;// 字母数量
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                szCount++;
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                zmCount++;
            }
        }
        System.out.println(szCount + "--------" + zmCount);
    }
}
