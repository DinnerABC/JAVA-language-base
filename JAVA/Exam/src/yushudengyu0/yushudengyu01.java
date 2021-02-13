package yushudengyu0;

import java.util.Scanner;

public class yushudengyu01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double num,yushu;
		System.out.print("请输入一个数：");
		num=input.nextDouble();
		
		yushu=num%2;
		if(yushu==0) {
			System.out.print("The number is Even");
		}else {
			System.out.print("The number is Odd");
		}
		input.close();
	}
}