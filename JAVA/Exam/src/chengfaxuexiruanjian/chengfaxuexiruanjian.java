package chengfaxuexiruanjian;

import java.util.Random;
import java.util.Scanner;

public class chengfaxuexiruanjian{
	public static void main(String[] args){
		Random random=new Random();
		Scanner input=new Scanner(System.in);
		int num1,num2,judge,answer,daan;
		String conti;
		
		do{
			num1=random.nextInt(9)+1;
			num2=random.nextInt(9)+1;
			answer=num1*num2;

			do{
				System.out.print(num1+"����"+num2+"=");
				daan=input.nextInt();
				if(daan==answer){
					System.out.println("�������");
					judge=1;
				}
				else{
					System.out.println("����ˣ��ٶ������С�Խ����԰ɣ�");
					judge=0;
				}
			}while(judge==0);
			System.out.print("�㻹�����������(y/n)");
			conti=input.next();
		}while("y".equals(conti));
		System.out.print("лл��ʹ�ñ�������ڴ������ٴ�ʹ��");
		input.close();
	}
}