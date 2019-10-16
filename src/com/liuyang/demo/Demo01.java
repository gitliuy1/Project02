package com.liuyang.demo;

import java.util.ArrayList;
import java.util.Date;

public class Demo01 {

    /**
     * 快捷键使用
     * <p>
     * 执行程序 ：alt + r
     * 填充返回补全：alt + enter
     * 查看类的继承关系：F4
     * 批量重命名 alt + shift + r
     * try{}cath(){}finally{} : alt + shift + z
     * 全局搜索 Ctrl + h
     * 查看类的继承结构图：Ctrl + shift + u
     * 查看方法重写结构：ctrl + alt + h
     * 抽取代码封装为方法：ctrl + shift + m
     * 查找刚修改过的文件（class）：ctrl + e
     * 打开复制板的复制记录：ctrl + shift + v
     * 查看方法在那些地方被调用：ctrl + shift + h
     *
     */
    public static void main(String[] args) {
        //region Description
        System.out.println("hello word!!!");
        System.out.println("hello word!!!");
        System.out.println("hello word!!!");
        System.out.println("hello word!!!");
        //endregion
        Date dt = new Date();

        System.out.println(dt);

        ArrayList list = new ArrayList();



    }

    /*public void  mothed1(){
        try (FileInputStream inputStream = new FileInputStream(new File("C:/"))) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }*/
}
