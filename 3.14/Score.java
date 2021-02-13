import java.util.Scanner;

public class Score
{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入你的成绩：");
		double score=input.nextDouble();
		if(score>100){
			System.out.print("输入的内容不合法！");
		}else if(score>=90 && score<100){
			System.out.print("你的成绩优秀！");
		}else if(score>=80 && score<90){
			System.out.print("你的成绩良好！");
		}else if(score>=70 && score<80){
			System.out.print("你的成绩还行！");
		}else if(score>=60 && score<70){
			System.out.print("你的成绩合格！");
		}else{
			System.out.print("你的成绩不合格！！");
		}
		input.close();
	}
}