package xunhuanshuruchengji;

import java.util.Scanner;

public class xunhuanshuruchegnji1{
	private static Scanner input;

	public static void main(String[] args){
		input = new Scanner(System.in);
		int i;
		double score,count=0;
		System.out.println("������ѧ��������");
		int student=input.nextInt();
		for(i=1;i<=student;i++){
			System.out.println("�������"+i+"��ѧ���ĳɼ���");
			score=input.nextDouble();
			if(score<=60){
				continue;
			}
			count++;
		}
		System.out.println("60�����ϵ�ѧ������Ϊ��"+(int)count);
		System.out.println("����ѧ���İٷֱ�Ϊ��"+(count/student)*100+"%");
	}
}