package com.thinkgem.jeesite.test;

import java.util.Date;

public class DomainTest {

    /*public static void main(String[] args) {
        String domainName = "www.baidu.com.asdasd.qqq";
        String[] arr = domainName.split("\\.");
        String[] newArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr.length - i - 1] = arr[i];
        }
        StringBuilder newDomainName = new StringBuilder();
        for (int i = 0; i < newArr.length; i++) {
            newDomainName.append(newArr[i]);
            if(i != newArr.length -1){
                newDomainName.append(".");
            }
        }
        System.out.println(newDomainName.toString());
    }*/
    public static void main(String[] args) {
        System.out.println(new Date(1519785628313l));
    }
}
