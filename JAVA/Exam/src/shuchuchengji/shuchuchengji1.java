package shuchuchengji;

import java.util.Scanner;

public class shuchuchengji1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("��������ĳɼ���");
		double score=input.nextDouble();
		if(score>100){
			System.out.print("��������ݲ��Ϸ���");
		}else if(score>=90 && score<=100){
			System.out.print("����");
		}else if(score>=70 && score<90){
			System.out.print("����");
		}else if(score>=60 && score<70){
			System.out.print("����");
		}else if(score<60){
			System.out.print("������");
		}
		input.close();
	}
}