package com.arrays.wenwen;

import java.util.Arrays;

public class HelloWorld {
//编写一个 JAVA 程序，实现输出考试成绩的前三名
	
 /* main方法
 */
	public static void main(String[] args) {
		int[] scores = new int[]{12,54,98,32,-89,90,100,120};//成绩数组
        System.out.println("考试的前三名为：");
        HelloWorld hello = new HelloWorld();//创建对象hello
        hello.showTop3(scores);//调用方法
	}
	/*
	 * 定义方法showTop3,输出成绩数组前三名，其中判断成绩的有效性
	 */
	 public void showTop3(int[] scores){
         Arrays.sort(scores);//Arrays.sort方法实现成绩数组排序
         int num = 0;//保证输出有效成绩的个数
         for(int i = scores.length-1;i>=0;i--){//for循环遍历数组
             if(scores[i]<0||scores[i]>100){//判断数组元素的有效性
                 continue;//数组元素无效则结束当前循环
             }
             num++;//数组有效元素数
             if(num>3){//确保输出三个有效成绩
             	break;
             }
             System.out.println(scores[i]);
         }
     }

}
