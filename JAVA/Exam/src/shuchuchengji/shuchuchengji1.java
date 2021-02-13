package shuchuchengji;

import java.util.Scanner;

public class shuchuchengji1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入你的成绩：");
		double score=input.nextDouble();
		if(score>100){
			System.out.print("输入的内容不合法！");
		}else if(score>=90 && score<=100){
			System.out.print("优秀");
		}else if(score>=70 && score<90){
			System.out.print("良好");
		}else if(score>=60 && score<70){
			System.out.print("及格");
		}else if(score<60){
			System.out.print("不及格");
		}
		input.close();
	}
}