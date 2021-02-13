package xunhuanshuruchengji;

import java.util.Scanner;

public class xunhuanshuruchegnji1{
	private static Scanner input;

	public static void main(String[] args){
		input = new Scanner(System.in);
		int i;
		double score,count=0;
		System.out.println("请输入学生数量：");
		int student=input.nextInt();
		for(i=1;i<=student;i++){
			System.out.println("请输入第"+i+"个学生的成绩：");
			score=input.nextDouble();
			if(score<=60){
				continue;
			}
			count++;
		}
		System.out.println("60分以上的学生人数为："+(int)count);
		System.out.println("及格学生的百分比为："+(count/student)*100+"%");
	}
}