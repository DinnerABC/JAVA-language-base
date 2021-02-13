import java.util.Scanner;

public class lovejava{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入循环次数：");
		int times=input.nextInt();
		int i=1;
		while(i<=times){
			System.out.print("I love Java!");
			i++;
		}
		input.close();
	}
}