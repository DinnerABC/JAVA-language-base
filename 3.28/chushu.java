import java.util.Scanner;

public class chushu{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int x=input.nextInt();
		if(x%7==1){
			System.out.print("此数不能被7整除。");
		}
		else{
			System.out.print("该除数除以7的商为："+x/7);
		}
		input.close();
	}
}