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
				System.out.print(num1+"乘以"+num2+"=");
				daan=input.nextInt();
				if(daan==answer){
					System.out.println("你真棒！");
					judge=1;
				}
				else{
					System.out.println("答错了！再动动你的小脑筋试试吧！");
					judge=0;
				}
			}while(judge==0);
			System.out.print("你还想继续做题吗？(y/n)");
			conti=input.next();
		}while("y".equals(conti));
		System.out.print("谢谢您使用本软件，期待您的再次使用");
		input.close();
	}
}