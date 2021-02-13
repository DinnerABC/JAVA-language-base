import java.util.Scanner;

public class rate{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入你的工资：");
		double work=input.nextDouble();
		double rate=0;
		double rate35=(5000-3000)*0.05;
		double rate510=(10000-5000)*0.1;
		double rate1020=(20000-10000)*0.15;
		if(work<=3000){
			rate=0;
		}else if(work>3000 && work<=5000){
			rate=(work-3000)*0.05;
		}else if(work>5000 && work<=10000){
			rate=(work-5000)*0.1+rate35;
		}else if(work>10000 && work<=20000){
			rate=(work-10000)*0.15+rate35+rate510;
		}else{
			rate=(work-20000)*0.25+rate35+rate510+rate1020;
		}
		System.out.print("你的工资税收是："+rate+"元。");
		input.close();
	}
}