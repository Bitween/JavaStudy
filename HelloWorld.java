package com.arrays.wenwen;

import java.util.Arrays;

public class HelloWorld {
//��дһ�� JAVA ����ʵ��������Գɼ���ǰ����
	
 /* main����
 */
	public static void main(String[] args) {
		int[] scores = new int[]{12,54,98,32,-89,90,100,120};//�ɼ�����
        System.out.println("���Ե�ǰ����Ϊ��");
        HelloWorld hello = new HelloWorld();//��������hello
        hello.showTop3(scores);//���÷���
	}
	/*
	 * ���巽��showTop3,����ɼ�����ǰ�����������жϳɼ�����Ч��
	 */
	 public void showTop3(int[] scores){
         Arrays.sort(scores);//Arrays.sort����ʵ�ֳɼ���������
         int num = 0;//��֤�����Ч�ɼ��ĸ���
         for(int i = scores.length-1;i>=0;i--){//forѭ����������
             if(scores[i]<0||scores[i]>100){//�ж�����Ԫ�ص���Ч��
                 continue;//����Ԫ����Ч�������ǰѭ��
             }
             num++;//������ЧԪ����
             if(num>3){//ȷ�����������Ч�ɼ�
             	break;
             }
             System.out.println(scores[i]);
         }
     }

}
