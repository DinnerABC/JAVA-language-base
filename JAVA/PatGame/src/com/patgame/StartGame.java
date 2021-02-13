/* 
 * �汾��v1.1
 * 
 * ���ߣ�������
 * 
 * �༶���ƿ�1701
 * 
 * ���ݣ�1.���������ܣ�
 * 
 * 		2.�����������è������
 * 
 * 		3.ÿֻ����ʵ���������ܣ���ͳԣ�
 * 
 * 		4.�ڿα��Ļ����������˵ȼ�ϵͳ��
 * 
 * 		5.�����˾���ֵϵͳ��1-5��Ϊ50������5-10��Ϊ100������10-20��Ϊ150������20������Ϊ200������
 * 
 * 		6.������ʱ���Զ���������������ֵ�����Ӿ���ֵ�Ĺ��ܡ�
 */

package com.patgame;
import java.util.Scanner;

public class StartGame {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ������ů֮��");
		System.out.println("******************");
		
		System.out.println("��������Ҫ�����ĳ������ͣ�");
		System.out.println("��1��Сè��  ��2��С����");
		int op=input.nextInt();
		
		Operation oper = new Operation(op);
		JudgeSystem js = new JudgeSystem();
		
		switch(op) {
			case 1:
				Cat cat=new Cat();  //����Сè��
				js.autoReduce();
				System.out.println("��ѡ������è�����ࣺ");
				System.out.println("��1����˹è ��2��Ų����ɭè");

				if(input.nextInt()==1) {
					cat.setStrain("��˹è");
				}else {
					cat.setStrain("Ų����ɭè");
				}
				
				System.out.println("��������Ҫ�����ĳ������ƣ�");
				cat.setName(input.next());

				System.out.println("�����ɹ���");
				
				cat.firstIntroduce();  //��һ����������ʾ��
				
				//
				
				oper.OperationPat();	
				break;
				
			case 2:
				Pig pig = new Pig();  //��������
				js.autoReduce();
				System.out.println("��ѡ�����������Ա�");
				System.out.println("��1����GG ��2����MM");

				if(input.nextInt()==1) {
					pig.setSex("GG");
				}else {
					pig.setSex("MM");
				}
				System.out.println("��������Ҫ�����ĳ������ƣ�");
				pig.setName(input.next());
				System.out.println("�����ɹ���");
				
				pig.firstIntroduce();

				oper.OperationPat();
				break;
		}
		input.close();
	}
}