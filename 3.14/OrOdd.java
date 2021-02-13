import java.util.Scanner;

public class OrOdd{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num1,num2;
		System.out.print("请输入一个数：");
		num1=input.nextInt();
		if(num1%2==0){
			System.out.print(num1+" 是偶数");
		}else{
			System.out.print(num1+" 是奇数");
			}
		input.close();
	}
}