package com.liuyang.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LY start
 * @create 2019-10-15 11:10
 */
public class Demo02 {
    private String name;
    private static ArrayList<String> list;


    public static void main(String[] args) {
        System.out.println("xiaoming");
        System.out.println("*****");
        list = new ArrayList<String>();
        list.add(0,"xiaohong");
        for (String str : list) {
            System.out.println(str);
        }

        for (String s : list) {
            System.out.println(s);
        }
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            
        }

        for (String arg : args) {

        }
        List<String> list1 = new ArrayList<>();
        for (String s : list1) {

        }
        if (name == null) {

        }





        System.out.println("sout 快捷输出语句");
    }


}
