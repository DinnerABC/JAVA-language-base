/* 
 * 版本：v1.1
 * 
 * 作者：刘文正
 * 
 * 班级：计科1701
 * 
 * 内容：1.创建宠物框架；
 * 
 * 		2.共有两个宠物：猫和猪；
 * 
 * 		3.每只宠物实现两个功能：玩和吃；
 * 
 * 		4.在课本的基础上增加了等级系统；
 * 
 * 		5.增加了经验值系统，1-5级为50升级，5-10级为100升级，10-20级为150升级，20级以上为200升级；
 * 
 * 		6.增加随时间自动减少体力、心情值，增加经验值的功能。
 */

package com.patgame;
import java.util.Scanner;

public class StartGame {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎来到冷暖之家");
		System.out.println("******************");
		
		System.out.println("请输入你要领养的宠物类型：");
		System.out.println("（1）小猫咪  （2）小猪猪");
		int op=input.nextInt();
		
		Operation oper = new Operation(op);
		
		switch(op) {
			case 1:
				Cat cat=new Cat();  //创建小猫类
				
				System.out.println("请选择领养猫的种类：");
				System.out.println("（1）波斯猫 （2）挪威的森猫");

				if(input.nextInt()==1) {
					cat.setStrain("波斯猫");
				}else {
					cat.setStrain("挪威的森猫");
				}
				
				System.out.println("请输入你要领养的宠物名称：");
				cat.setName(input.next());

				System.out.println("领养成功！");
				
				cat.firstIntroduce();  //第一次领养的提示语
				
				//
				
				oper.OperationPat();	
				break;
				
			case 2:
				Pig pig = new Pig();  //创建猪类
				
				System.out.println("请选择领养猪的性别：");
				System.out.println("（1）猪GG （2）猪MM");

				if(input.nextInt()==1) {
					pig.setSex("GG");
				}else {
					pig.setSex("MM");
				}
				System.out.println("请输入你要领养的宠物名称：");
				pig.setName(input.next());
				System.out.println("领养成功！");
				
				pig.firstIntroduce();

				oper.OperationPat();
				break;
		}
		input.close();
	}
}
