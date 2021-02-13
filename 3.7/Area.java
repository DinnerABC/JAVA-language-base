import java.util.Scanner;

public class Area{
	public static void main(String[] args){
		final double PI=3.1415926;
		Scanner input = new Scanner(System.in);
		double r,area;
		System.out.println("请输入圆的半径：");
		r=input.nextDouble();
		area=PI*r*r;
		System.out.println("圆的面积是："+area);
		input.close();
	}
}